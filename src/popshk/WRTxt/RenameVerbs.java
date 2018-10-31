package popshk.WRTxt;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RenameVerbs {
    private String file;

    public RenameVerbs(String file){
        this.file=file;
    }

    public void WRTxt() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        int position = 0;
        int buff = 0;
            while (true){
                raf.seek(position);
                String text = raf.readLine().toLowerCase();
                position = text.indexOf("hello");
                if (position==-1){
                    raf.close();
                    break;
                }
                buff+=position;
                raf.seek(buff);
                raf.writeBytes("12345");
            }
    }

}

    //She sad me:"Hello, hello!!!".