package com.pluralsight;

public class Reservation {
    private String date, guestName, roomType;
    private double price, guestCount;
    private boolean isWeekend;

    public Reservation(String date, String guestName, String roomType, double price, double guestCount, boolean isWeekend) {
        this.date = date;
        this.guestName = guestName;
        this.roomType = roomType;
        this.price = price;
        this.guestCount = guestCount;
        this.isWeekend = isWeekend;
    }

}
