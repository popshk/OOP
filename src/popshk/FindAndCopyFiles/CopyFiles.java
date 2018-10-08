package popshk.FindAndCopyFiles;

import java.io.*;

public class CopyFiles {

    public static void copy(File src,File dest) throws IOException {
      FileInputStream fis =new FileInputStream(src);
        try {
            FileOutputStream fos =new FileOutputStream(dest);
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

    public static void copyDir (String srcDir,String destDir) throws IOException {
        File src = new File(srcDir);
        File dest = new File(destDir);

        if(src.isDirectory()){
            if (!dest.isDirectory()){
                dest.mkdir();
            }
                File [] sfile = src.listFiles();
                File [] dfile = new File[sfile.length];
                    for (int i=0;i<sfile.length;i++){
                        String from = sfile[i].getPath();
                        String to = from.replace(srcDir,destDir);
                        dfile[i] = new File(to);
                            copy(sfile[i],dfile[i]);
                    }
        } else System.out.println("Destination directory not found!!!");

    }

    public static void main(String[] args) {
        String srcDir ="/home/popshk/Рабочий стол/test1/test2/";
        String destDir="/home/popshk/Рабочий стол/testDir/";
        try {
            copyDir(srcDir,destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
