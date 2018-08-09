package popshk.Monitor;

public class FileEvent implements IntFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: "+s);
    }
}
