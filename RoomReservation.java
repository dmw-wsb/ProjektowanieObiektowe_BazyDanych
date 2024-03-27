package pl.wsb.hotel;

import java.time.LocalDate;

public class RoomReservation {
    private LocalDate date;
//    private LocalDate startDate;
//    private LocalDate endDate;
    private boolean isConfirmed = false;
    private Client client;
    private Room room;

    public RoomReservation(Client client, Room room){ // default reservation time to now()
        this(client, room, LocalDate.now());
    }

    public RoomReservation(Client client, Room room, LocalDate date){
        this.client = client;
        this.room = room;
        this.date = date;
    }

    public void confirmReservation(){
        isConfirmed = true;
        client.incStayCount();
    }

    public double calculatePrice(){
        double discount = 1.0 - Math.min(0.2, 0.05 * client.getStayCount());
        return (client.getIsVIP() ? 0.9 : 1) * discount * room.getPrize();
    }

    public void printInformation(){
        System.out.println("Client data:");
        client.printInformation();
        System.out.println("Room data:");
        room.printInformation();
        System.out.println("Reservation is" + (isConfirmed ? "" : " not") + " confirmed");
//        System.out.println("Room reserved from " + startDate + " to " + endDate);
    }
}
