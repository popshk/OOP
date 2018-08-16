package popshk.Monitor;

public class FileEvent implements IntFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.print("File added: "+s+" ");
    }

    @Override
    public void onFilesAdded() {
        System.out.print("Files added");
    }


}
