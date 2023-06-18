

import com.engeto.hotel.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {




        List<Guest> guestList = new ArrayList<>();
        // má index 0
        guestList.add(new Guest("Karel ", "Dvořák  ",
                LocalDate.of(1990, 5, 15)));
        // má index 1
        guestList.add(new Guest("Petr  ", "Dvořák  ",
                LocalDate.of(1979, 1, 3)));
        //  // má index 2
        guestList.add(new Guest("ABC   ", "Relax   ", LocalDate.of(1900, 1, 1)));
        // má index 3
        guestList.add(new Guest("Alena ", "Krasová ", LocalDate.of(1978, 05, 12)));


        List<Room> roomList = new ArrayList<>();


        roomList.add(new Room(1, 1, new BigDecimal(1000), true, true));
        roomList.add(new Room(2, 1, new BigDecimal(1000), true, true));
        roomList.add(new Room(3, 3, new BigDecimal(2400), false, true));
        roomList.add(new Room(4, 2, new BigDecimal(1600), false, false));


        BookingManager bookingManager = new BookingManager();

        bookingManager.add(new Booking(roomList.get(2),guestList.get(0),LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7), TypeOfStay.WORKING));
        bookingManager.add(new Booking(roomList.get(1),guestList.get(1),LocalDate.of(2023,8,18),
                LocalDate.of(2023,8,21),TypeOfStay.TYPEOFVACATION));


        //guestList.forEach(System.out::println);





        // 30 jednodenních rezervací pro rekreační pobyty pro cestovní kancelář ABC Relax
        {
            LocalDate reservationsFrom = LocalDate.of(2023, 6, 1);
            LocalDate reservationsTo = LocalDate.of(2023, 6, 2);


            for (int i = 0; i < 30; i++) {


                bookingManager.add(new Booking(roomList.get(1), guestList.get(2), reservationsFrom, reservationsTo, TypeOfStay.TYPEOFVACATION));

                reservationsFrom = reservationsFrom.plusDays(1);
                reservationsTo = reservationsTo.plusDays(1);

            }
            //Alena Krásová si vytvoří 7 rezervací pokoje číslo 1
            // vždy na prvních 5 dnů v měsící počítaje 1. 6. 2023. Budou to pracovní pobyty.
            {
                LocalDate reservationsFrom1 = LocalDate.of(2023, 6, 1);
                LocalDate reservationsTo1 = LocalDate.of(2023, 6, 6);


                for (int i = 0; i < 7; i++) {


                    bookingManager.add(new Booking(roomList.get(0), guestList.get(3),
                            reservationsFrom1, reservationsTo1, TypeOfStay.WORKING));

                    reservationsFrom1 = reservationsFrom1.plusMonths(1);
                    reservationsTo1 = reservationsTo1.plusMonths(1);

                }

            }
            //ABC Relax si rezervuje pokoj číslo 2 na srpen 2023.Bude se jednat o čtyři třídenní rezervace,
            // které budou začínat 1., 8., 15. a 22. srpna 2023

            {
                long pocetDnu = 3;
                LocalDate reservationsFrom2 = LocalDate.of(2023, 8, 1);
                LocalDate reservationsTo2 = reservationsFrom2.plusDays(pocetDnu);


                for (int i = 0; i < 4; i++) {

                    bookingManager.add(new Booking(roomList.get(1), guestList.get(2), reservationsFrom2,
                            reservationsTo2, TypeOfStay.TYPEOFVACATION));

                    reservationsFrom2 = reservationsFrom2.plusDays(7);
                    reservationsTo2 = reservationsFrom2.plusDays(pocetDnu);

                }

            }
            System.out.println("Počet rezervací je:  "+bookingManager.getNumberOfBookings());
            System.out.println("Počet pracovních pobytů je:  "+bookingManager.getNumberOfWorkingBookings());

            System.out.println(""                       );
            System.out.println("Výpis všech rezervací: ");
            System.out.println(""                       );
            bookingManager.getPrintAllReservations();
            System.out.println(""                       );
            System.out.println("Prvních osm rekreačních rezervací: ");
            bookingManager.getTheFirstEightHolidayReservations();

            System.out.println(bookingManager.getNumberOfBookings()/ guestList.size());



        }







    }
}