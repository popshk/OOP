package popshk.Phones;

public abstract class Phone {
    protected String name = "Phone";
    protected boolean touch;
    protected boolean hasWiFi;
    protected double screenSize;
    protected String number;
    private String toCallNumber;
    private int callCounter =0;

    public Phone(){
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

    public int getCallCounter(){
        return callCounter;
    }

    public String getToCallNumber(){return toCallNumber;}

    public void answer(){
        System.out.println(name+" "+number+" answer");
    }

    public void call(String toCallNumber){
        this.toCallNumber=toCallNumber;
        callCounter++;
        System.out.println(name+" "+this.number+" call to "+toCallNumber);
    }

    public abstract void sendSMS(String number,String message);

}
