package popshk.Phones;

public abstract class Phone {
    private final String phone = "Phone";
    protected boolean touch;
    protected boolean hasWiFi;
    protected double screenSize;

    public Phone(){
        System.out.println("Phone");
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

    public void call(String number){
        System.out.println(phone+" call to "+number);
    }

    public abstract void sendSMS(String number,String message);
}
