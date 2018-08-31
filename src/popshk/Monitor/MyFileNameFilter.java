package popshk.Monitor;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter implements FilenameFilter {

    private String format;

    public MyFileNameFilter(String format){
        this.format=format;
    }

    @Override
    public boolean accept(File file, String name) {
        return name.endsWith(format);
    }
}
