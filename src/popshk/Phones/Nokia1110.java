package popshk.Phones;

public class Nokia1110 extends Phone {

    public Nokia1110(String number){
        name = "Nokia";
        hasWiFi = false;
        touch = false;
        screenSize = 2.3;
        this.number = number;
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public void sendSMS(String number, String message) {

    }
}
