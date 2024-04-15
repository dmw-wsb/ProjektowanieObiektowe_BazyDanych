package pl.wsb.hotel;
import java.time.LocalDate;

public class TimeService extends SpecialService{
    public TimeService(){
        this.name = "Current time";
    }
    public void orderService(){
        System.out.println(LocalDate.now());
    }
    public String getServiceDescription(){
        return "Only the most accurate " + name;
    }
    public boolean isAvailable(){
        return Math.round(Math.random()) == 1; //random 0/1
    }
}
