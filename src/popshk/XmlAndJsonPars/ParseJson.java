package popshk.XmlAndJsonPars;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;


public class ParseJson {
    public static void main(String[] args) {
                try (FileInputStream file = new FileInputStream(
                        "/home/popshk/workspace/OOP/src/popshk/XmlAndJsonPars/contactJson")) {
            byte[] buf = new byte[file.available()];
            file.read(buf);
            String json = new String(buf);


            Gson gson=new GsonBuilder().create();
            Contact contact = gson.fromJson(json, Contact.class);

            System.out.println(contact);

        } catch (Exception e) {
            e.printStackTrace();
}
    }
}
