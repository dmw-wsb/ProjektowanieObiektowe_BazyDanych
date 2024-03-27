package pl.wsb.hotel;

public class Room {
    private String id; // room number
    private String description;
    private double area;
    private int floor;
    private boolean hasKingSizeBed;

    private int maxPeopleCapacity;
    private boolean hasBathtub;
    private double prize;

    public Room(String id,
                String description,
                double area,
                int floor,
                boolean hasKingSizeBed,
                int maxPeopleCapacity,
                boolean hasBathtub,
                double prize){
        this.id = id;
        this.description = description;
        this.area = area;
        this.floor = floor;
        this.hasKingSizeBed = hasKingSizeBed;
        this.maxPeopleCapacity = maxPeopleCapacity;
        this.hasBathtub = hasBathtub;
        this.prize = prize;
    }

    public double getPrize() {
        return prize;
    }

    public void printInformation(){
        System.out.println("Room number: " + id);
        System.out.println("Room description: " + description);
        System.out.println("Room size: " + area);
        System.out.println("Room is on floor " + floor);
        System.out.println("Room " + (hasKingSizeBed ? "has" : "doesn't have") + " king size bed");
        System.out.println("Room " + (hasBathtub ? "has bathtub" : "has shower"));
        System.out.println("Room for " + maxPeopleCapacity + (maxPeopleCapacity==1 ? " person" : " people"));
    }
}
