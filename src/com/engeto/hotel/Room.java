package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    private int room;
    private int numberOfBed;
    private BigDecimal pricePerNight;

    private boolean withBalcony;

    private boolean withSeaView;


    public Room(int room, int numberOfBed, BigDecimal pricePerNight, boolean withBalcony, boolean withSeaView) {
        this.room = room;
        this.numberOfBed = numberOfBed;
        this.pricePerNight = pricePerNight;
        this.withBalcony = withBalcony;
        this.withSeaView = withSeaView;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isWithBalcony() {
        return withBalcony;
    }

    public void setWithBalcony(boolean withBalcony) {
        this.withBalcony = withBalcony;
    }

    public boolean isWithSeaView() {
        return withSeaView;
    }

    public void setWithSeaView(boolean withSeaView) {
        this.withSeaView = withSeaView;
    }
}