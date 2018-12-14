package popshk.XmlAndJsonPars;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "trains")
public class Trains {
    @XmlElement(name = "train")
    private List<Train> list = new ArrayList<>();

        public void add(Train train){
            list.add(train);
        }

        public List<Train> get(){
            return list;
        }


    @Override
    public String toString() {
        return Arrays.deepToString(list.toArray());
    }
}
