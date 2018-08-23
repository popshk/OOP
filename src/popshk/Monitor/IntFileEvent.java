package popshk.Monitor;

import java.io.File;

public interface IntFileEvent {
    void onFileAdded(String s);
    void onFilesAdded();
    void onNewTxtFileAdded(String s);
}
