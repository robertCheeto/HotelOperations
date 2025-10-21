package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int totalNights;
    private boolean weekend;

    public Reservation(String roomType, int totalNights, boolean weekend) {
        this.roomType = roomType.trim();

        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        this.totalNights = totalNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalNights() {
        return totalNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getReservationTotal() {
        if (weekend) {
            price = ((price * 0.1) + price);
        }

        return price * totalNights;
    }

}
