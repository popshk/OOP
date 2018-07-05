package popshk.Phones;

public abstract class Phone {
    protected String phoneName;
    protected boolean touch;
    protected boolean hasWiFi;
    protected double screenSize;
    protected String number;

    public Phone(){
        phoneName = "Phone";
        System.out.println(phoneName);
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getNumber(){return number;}

    public void call(String number){
        System.out.println(phoneName+" call to "+number);
    }

    public abstract void sendSMS(String number,String message);
}
