package popshk.WRTxt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "/home/popshk/Рабочий стол/test1/2.txt";

        RenameVerbs renameVerbs =new RenameVerbs(path);
            renameVerbs.WRTxt();
    }
}
