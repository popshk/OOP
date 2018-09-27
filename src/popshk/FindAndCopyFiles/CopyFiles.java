package popshk.FindAndCopyFiles;

import java.io.*;

public class CopyFiles {

    String srcDir ="/home/popshk/Рабочий стол/test1/";
    String destDir="/home/popshk/Рабочий стол/test1/testDir";

    public static void copy(String src,String dest) throws IOException {
      FileInputStream fis =new FileInputStream(new File(src));
        try {
            FileOutputStream fos =new FileOutputStream(new File(dest));
                try {
                    byte [] buff=new byte[4096];
                    int lenght;
                    while ((lenght=fis.read(buff))>0){
                        fos.write(buff,0,lenght);
                    }
                }finally {
                    fos.close();
                }
        } finally {
            fis.close();
        }
    }

    public static void copyDir (String srcDir,String destDir){
        File src = new File(srcDir);
        File dest = new File(destDir);


    }

    public static void main(String[] args) {

    }
}
