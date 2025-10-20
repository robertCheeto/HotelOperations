package com.pluralsight;

public class Reservation {
    private String date, guestName, roomType;
    private double price;
    private int totalNights;
    private boolean isWeekend;

    public Reservation(String date, String guestName, String roomType, double price, int totalNights, boolean isWeekend) {
        this.date = date;
        this.guestName = guestName;
        this.roomType = roomType;
        this.price = price;
        this.totalNights = totalNights;
        this.isWeekend = isWeekend;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalNights() {
        return totalNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        if (isWeekend) {
            price = ((price * 0.1) + price);
        }

        return price * totalNights;
    }

}
