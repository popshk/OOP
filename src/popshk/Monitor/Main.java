package popshk.Monitor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] list = {"1.txt","2.txt","3.txt"};
        Monitor m = new Monitor(list,new FileEvent());
            m.start();
    }
}
