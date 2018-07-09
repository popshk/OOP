package popshk.Phones;

public class Main {
    public static void main(String[] args) {
        Phone [] phones = {
            new Nokia1110("111"),
            new Nokia1110("222"),
            new Nokia1110("333"),
            new Nokia1110("444")
        };

        Nokia1110 myNokia = new Nokia1110("000");
            myNokia.call("333");
            for (Phone p:phones){
                if (myNokia.getToCallNumber().equals(p.number)) p.answer();
            }
    }
}
