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
    IntFileEvent event;
    String setPath = "/home/popshk/Рабочий стол/test1/";

    public Monitor(String [] files, IntFileEvent event){
        this.files= Arrays.copyOf(files,files.length);
        this.event=event;
    }

    public void start() throws IOException {
        File f;
        int n=0;

        while (true) {
            for (int i=0;i<files.length;i++){
                if(files[i]!=null){
                    f = new File(setPath+files[i]);
                        if (f.exists() && f.isFile()){
                            files[i]=null;
                            n++;
                    }
                }
            }   if (n==files.length) {event.onFilesAdded(); break;}
                    /*Path path = Paths.get(file);
                        BasicFileAttributes view = Files.getFileAttributeView
                            (path,BasicFileAttributeView.class).readAttributes();
                                System.out.println(view.creationTime());*/

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Waiting...");
        }
    }
}
