package popshk.FindFiles;

import popshk.Monitor.MyFileNameFilter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FindFiles {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        try {
            findFiles("/home/popshk/Рабочий стол/test1/","txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            listAll("/home/popshk/Рабочий стол/test1/",list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void findFiles(String path, String format) throws IOException {
        File dir=new File(path);
        File[] files = dir.listFiles(new MyFileNameFilter(format));
        ArrayList<String> list = new ArrayList<>();
            for (int i=0;i<files.length;i++){
                list.add(files[i].getName());
            }

            for (String s:list) {
                System.out.println(s);
            }
    }

    private static void listAll(String path,ArrayList<String> list) throws IOException {
        File dir=new File(path);
        File[] files =dir.listFiles();

        if (list==null)return;

        for (File f:files){
            if (f==null) break;
            if (f.isFile()){
                list.add("Is File "+f.getCanonicalPath());
            }else {
                list.add("Is Directory "+f.getCanonicalPath());
                listAll(f.getCanonicalPath(),list);
            }
        }

        for (String s:list){
            System.out.println(s);
        }
    }
}
