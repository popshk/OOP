package popshk.Phones;

public class Nokia1110 extends Phone {

    protected int smsCounter=0;

    public Nokia1110(String number){
        name = "Nokia";
        hasWiFi = false;
        touch = false;
        screenSize = 2.3;
        this.number = number;
    }

    public int getSmsCounter(){
        return smsCounter;
    }

    @Override
    public void call(String number) {
        super.call(number);
        //and your addition, if be it.
    }

    @Override
    public void sendSMS(String number, String message) {
        smsCounter++;
        System.out.println(name+" "+this.number+" Send to "+number+" message: "+message);
    }

}
