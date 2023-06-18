package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    List<Booking> bookings = new ArrayList<>();

    public void add(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public int getNumberOfBookings() {
        return bookings.size();
    }


    public double getAverageNumberOfGuestsPerReservation() {
        double totalGuests = 0;
        for (Booking booking : bookings) {
            totalGuests += 1;
        }
        return totalGuests / getNumberOfBookings();
    }


    @Override
    public String toString() {
        return "BookingManager{" +
                "bookings=" + bookings +
                '}';
    }

    public int getNumberOfWorkingBookings() {
        int number = 0;
        for (Booking booking : bookings) {
            if (booking.getTypeOfStay() == TypeOfStay.WORKING) {
                number++;
            }

        }
        return number;
    }

    public void getTheFirstEightHolidayReservations() {
        int i = 0;

        for (Booking booking : bookings) {
            for (; i < 8; ) {
                if (booking.getTypeOfStay() == TypeOfStay.TYPEOFVACATION) {
                    i++;
                    System.out.println(booking.getReservationsFrom() +
                            "  až  " + booking.getReservationsTo() + "  " + booking.getGuest().getName() + "   " + booking.getGuest().getSurname() +
                            "     (" + booking.getGuest().getDateOfBirth() + ")");
                }
                break;

            }


        }

    }

    // metoda,pro výpis všech rezervací
    public void getPrintAllReservations() {
        for (Booking booking : bookings) {
            System.out.println(booking.getReservationsFrom() +
                    "  až  " + booking.getReservationsTo() + "  " + booking.getGuest().getName() + "   " + booking.getGuest().getSurname() +
                    "     (" + booking.getGuest().getDateOfBirth() + "),   [počet lůžek,  "
                    + booking.getRoom().getNumberOfBed() + ", výhled na moře:   " +
                    (booking.getRoom().isWithSeaView() ? "ANO" : "NE") + ", s balkonem:   "
                    + (booking.getRoom().isWithBalcony() ? "ANO" : "NE"));
        }


    }

}





