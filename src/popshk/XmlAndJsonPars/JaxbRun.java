package popshk.XmlAndJsonPars;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbRun {
    public static void main(String[] args) {
        String fileSrc="/home/popshk/workspace/OOP/src/popshk/XmlAndJsonPars/trainsList";
        Trains trains = XmlToObj(fileSrc);
              trains.add(new Train(3,"Kiev","Odessa","04.12.2018","01:34"));

            ObjToXml(trains,fileSrc);
            //System.out.println(XmlToObj(fileSrc));



    }

    private static void ObjToXml(Object object,String fileSrc){
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
                    marshaller.marshal(object,new File(fileSrc));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static Trains XmlToObj(String fileSrc){

        try {
            JAXBContext context = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

                return (Trains)unmarshaller.unmarshal(new File(fileSrc));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
