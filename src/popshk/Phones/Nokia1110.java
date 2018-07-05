package popshk.Phones;

public class Nokia1110 extends Phone {

    public Nokia1110(String number){
        phoneName ="Nokia1110";
        hasWiFi = false;
        touch = false;
        screenSize = 2.3;
        this.number = number;
        System.out.println(phoneName);
    }

    @Override
    public void call(String number) {
        super.call(number);
            System.out.println(phoneName+" call to "+number);
    }

    @Override
    public void sendSMS(String number, String message) {

    }
}
