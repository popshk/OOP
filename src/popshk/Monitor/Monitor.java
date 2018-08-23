package popshk.Monitor;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class Monitor {
    String [] files;
    String file;
    IntFileEvent event;
    String dir;

    public Monitor(String dir,String [] files, IntFileEvent event){
        this.dir=dir;
        this.files= Arrays.copyOf(files,files.length);
        this.event=event;
    }

    public Monitor (String file, IntFileEvent event){
        this.file=file;
        this.event=event;
    }

    public void startForFiles() throws IOException {
        File f;
        int n=0;

        while (true) {
            for (int i=0;i<files.length;i++){
                if(files[i]!=null){
                    f = new File(dir+files[i]);
                        if (f.exists() && f.isFile()){
                            files[i]=null;
                            n++;
                    }
                }
            }   if (n==files.length) {event.onFilesAdded(); break;}
                WaitingTrigger();
        }
    }

    public void startForFile() throws IOException {
        while (true){
            File f = new File(file);
            if (f.exists()&&f.isFile()){
                if (event!=null){
                    event.onFileAdded(file);
                        creationFileTime(file);
                                    break;
                }
            }
                WaitingTrigger();
        }
    }

    public void startMonitoring(){
        while (true){
            File fdir=new File(file);
                if (fdir.exists()&&fdir.isDirectory() && event != null){
                    File [] filesList = fdir.listFiles(new FilenameFilter() {
                        @Override
                        public boolean accept(File file, String name) {
                            return name.endsWith(".txt");
                        }
                    });
                    if (filesList.length!=0){
                        String [] files = fdir.list();
                            for (int i=0;i<files.length;i++){
                                if (files[i].endsWith(".txt"))
                                    event.onNewTxtFileAdded(files[i]);
                            }
                                break;
                    }
                }
                WaitingTrigger();
        }
    }

    static void WaitingTrigger(){
        try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Waiting...");
    }

    static void creationFileTime (String file) throws IOException {
        Path path = Paths.get(file);
            BasicFileAttributes view = Files.getFileAttributeView
                (path,BasicFileAttributeView.class).readAttributes();
                     System.out.println(view.creationTime());
    }
}
