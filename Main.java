package pl.wsb.hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Jan", "Kowalski", LocalDate.of(1990,1,1), true);
        Client c2 = new Client("Anna", "Dworska", LocalDate.of(2000,2,2), false, "vegan");

        System.out.println("Test Client:");
        System.out.println("c1 data");
        c1.printInformation();
        System.out.println("c2 data");
        c2.printInformation();
        System.out.print("c1 id: ");
        c1.debugPrintId();
        System.out.print("c2 id: ");
        c2.debugPrintId();
        System.out.println();

        Room r1 = new Room("111", "Standard room for 3", 24, 1, false, 3, false, 300);
        Room r2 = new Room("555", "Exclusive room for 2", 20, 5, true, 2, true, 600);

        System.out.println("Test Room:");
        System.out.println("r1 data");
        r1.printInformation();
        System.out.println("r2 data");
        r2.printInformation();
        System.out.println();

        RoomReservation rr1 = new RoomReservation(c1,r1);
        RoomReservation rr2 = new RoomReservation(c2,r2, LocalDate.of(2024,4,1));

        System.out.println("Test RoomReservation:");
        System.out.println("rr1 data");
        rr1.printInformation();
        System.out.println("rr2 data");
        rr2.printInformation();
        System.out.println("Room Reservation confirmation");
        rr1.confirmReservation();
        rr2.confirmReservation();
        System.out.println("rr1 data");
        rr1.printInformation();
        System.out.println("rr2 data");
        rr2.printInformation();
        System.out.println("Calculate price");
        System.out.println("RR1 price: " + rr1.calculatePrice());
        System.out.println("RR2 price: " + rr2.calculatePrice());
        System.out.println();

    }
}
