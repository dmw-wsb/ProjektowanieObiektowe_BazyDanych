package pl.wsb.hotel;

import java.time.LocalDate;

public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private String specialDiet;
    private boolean isVIP;
    private int stayCount = 0;

    private static long idCounter = 0;
    private static String createID() {
        return String.valueOf(idCounter++);
    }

    public Client(String firstName, String lastName, LocalDate birthDate, boolean isVIP){ // default specialDiet to ""
        this(firstName, lastName, birthDate, isVIP, "");
    }

    public Client(String firstName, String lastName, LocalDate birthDate, boolean isVIP, String specialDiet){
        this.id = createID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.isVIP = isVIP;
        this.specialDiet = specialDiet;
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getStayCount() {
        return stayCount;
    }

    public void incStayCount(){
        stayCount+=1;
    }

    public boolean getIsVIP(){
        return isVIP;
    }

    public void debugPrintId(){
        System.out.println(id);
    }

    public void printInformation(){
        System.out.println("Client full name: " + getFullName());
        System.out.println("Client age: " + getAge());
        System.out.println("Client birth date: " + birthDate);
        System.out.println("Client has following diets: " + specialDiet);
        System.out.println("Client has stayed in this hotel " + stayCount + " times");
    }
}
