package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private static int idCounter = 1;
    private int id = idCounter++;
    private int room;
    private Guest guest;
    private List<Guest> otherGuests;
    private LocalDate reservationsFrom;
    private LocalDate reservationsTo;
    private TypeOfStay typeOfStay ;


    public Booking(int room, Guest guest, LocalDate reservationsFrom, LocalDate reservationsTo,
                   TypeOfStay typeOfStay) {
        this.room = room;
        this.guest = guest;
       // this.otherGuests = otherGuests;
        this.reservationsFrom = reservationsFrom;
        this.reservationsTo = reservationsTo;
        this.typeOfStay = typeOfStay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getReservationsFrom() {
        return reservationsFrom;
    }

    public void setReservationsFrom(LocalDate reservationsFrom) {
        this.reservationsFrom = reservationsFrom;
    }

    public LocalDate getReservationsTo() {
        return reservationsTo;
    }

    public void setReservationsTo(LocalDate reservationsTo) {
        this.reservationsTo = reservationsTo;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }


    @Override
    public String toString() {
        return
                "  ID rezervace:  " + id +'\n' +
                "  Pokoj:         " + room +'\n' +
                "  Host:          " + guest +'\n' +
                "  Rezervace od:  " + reservationsFrom +'\n' +
                "  Rezervace do:  " + reservationsTo +'\n' +
                "  Druh pobytu:   " + typeOfStay +'\n'


                ;
    }
}
