package design;

public abstract class WhoWeAre{

    static String companyName ="Mount Sinai Medical center";
    public final String mission ="Why we exist; why the world will be different because we are here.";
    public final String vision ="Who we want to become; what we want to achieve or create.";
    public String address = "1470 Madison Ave, NY 10029.";

    public void hospitalEstablished(){  //method implemented
        System.out.println(companyName+"\n"+address);
        System.out.println("In 1852 this hospital is established.\n");
    }
    public abstract void hospitalDescription();  //method declared
}
