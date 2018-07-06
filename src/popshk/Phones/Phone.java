package popshk.Phones;

public abstract class Phone {
    protected String name = "Phone";
    protected boolean touch;
    protected boolean hasWiFi;
    protected double screenSize;
    protected String number;

    public Phone(){
        System.out.println(name);
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
        System.out.println(name+" "+this.number+" call to "+number);
    }

    public void answer(){
        
    }

    public abstract void sendSMS(String number,String message);
}
