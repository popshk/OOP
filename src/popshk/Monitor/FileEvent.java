package popshk.Monitor;

import java.io.File;
import java.util.Arrays;

public class FileEvent implements IntFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.print("File added: "+s+" ");
    }

    @Override
    public void onFilesAdded() {
        System.out.println("Files added");
    }

    @Override
    public void onNewTxtFileAdded(String s) {
        System.out.println("File : "+s+" added");
    }
}
