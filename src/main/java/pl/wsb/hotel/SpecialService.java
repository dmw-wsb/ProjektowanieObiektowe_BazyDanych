package pl.wsb.hotel;

public abstract class SpecialService {
    protected  String name;
    public abstract void orderService();
    public abstract String getServiceDescription();
    public abstract boolean isAvailable();

    public void printInformation(){
        System.out.println("SpecialService name: " + name);
        System.out.println("SpecialService description: " + getServiceDescription());
        System.out.println("SpecialService isAvailable(): " + isAvailable());
        this.orderService();
    }
}
