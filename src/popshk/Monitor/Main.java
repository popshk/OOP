package popshk.Monitor;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor("/home/popshk/Рабочий стол/test1/testF.txt",new FileEvent());
            m.start();
    }
}
