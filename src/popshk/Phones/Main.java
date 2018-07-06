package popshk.Phones;

public class Main {
    public static void main(String[] args) {
        Nokia1110 nokia1 = new Nokia1110("11111");
        Nokia1110 nokia2 = new Nokia1110("22222");
        Nokia1110 nokia3= new Nokia1110("33333");
        Nokia1110 nokia4 = new Nokia1110("44444");
            nokia1.call(nokia2.getNumber());


    }
}
