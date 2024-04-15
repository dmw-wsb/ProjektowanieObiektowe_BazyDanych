package pl.wsb.hotel;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<SpecialService> specialServices;
    private ArrayList<Client> clients;
    private ArrayList<RoomReservation> roomReservations;
    private ArrayList<Room> rooms;

    public Hotel(String name){
        this.name = name;
        specialServices = new ArrayList<SpecialService>();
        clients = new ArrayList<Client>();
        roomReservations = new ArrayList<RoomReservation>();
        rooms = new ArrayList<Room>();
    }

    public void addService(SpecialService s){
        specialServices.add(s);
    }
    public void addClient(Client c){
        clients.add(c);
    }
    public void addReservation(RoomReservation rr){
        roomReservations.add(rr);
    }
    public void addRoom(Room r){
        rooms.add(r);
    }

    public void printInformation(){
        System.out.println("All Client data:");
        for(Client c : clients){
            c.printInformation();
        }
        System.out.println();
        System.out.println("All Room data:");
        for(Room r : rooms){
            r.printInformation();
        }
        System.out.println();
        System.out.println("All SpecialService data:");
        for(SpecialService s : specialServices){
            s.printInformation();
        }
        System.out.println();
        System.out.println("All RoomReservation data:");
        for(RoomReservation rr : roomReservations){
            rr.printInformation();
        }
        System.out.println();

    }

}
