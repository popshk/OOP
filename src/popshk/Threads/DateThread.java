package popshk.Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateThread {
    public static void main(String[] args) throws IOException {
        Thread myThread=new myThread();
            myThread.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            if (s.equals("q")) myThread.interrupt();
    }
}

class myThread extends Thread{

    @Override
    public void run() {
        while (!interrupted()){
            try {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
               interrupt();
            }

        }
    }
}
