package popshk.Monitor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //String [] list = {"1.txt","2.txt","3.txt"};
        String path = "/home/popshk/Рабочий стол/test1/";

        Monitor m1 = new Monitor(path,/*list,*/new FileEvent());
           // m1.startForFiles();
            m1.startMonitoring(".txt");

        /*Monitor m2 = new Monitor("/home/popshk/Рабочий стол/test1/3.txt",new FileEvent());
            m2.startForFile();*/

    }
}
