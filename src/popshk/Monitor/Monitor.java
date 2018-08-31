package popshk.Monitor;

import java.io.File;
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
                        break;
                }
            }
                WaitingTrigger();
        }
    }

    public void startMonitoring(String format) throws IOException {
        long time = System.currentTimeMillis();
        boolean b=true;
        while (b){
            File fdir=new File(file);
                if (fdir.exists()&&fdir.isDirectory() && event != null){
                    File [] filesList = fdir.listFiles(new MyFileNameFilter(format));
                    if (filesList.length!=0){
                            for (int i=0;i<filesList.length;i++){
                                if (creationFileTime(filesList[i].getCanonicalPath())>time){
                                    event.onNewTxtFileAdded(filesList[i].getName());
                                        b=false;
                                }
                            }
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

    static long creationFileTime (String file) throws IOException {
        Path path = Paths.get(file);
            BasicFileAttributes view = Files.getFileAttributeView
                (path,BasicFileAttributeView.class).readAttributes();
                     return view.creationTime().toMillis();
    }
}
