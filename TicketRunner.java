import java.time.LocalDateTime;

public class TicketRunner {
    public static void main(String[] args) {

        PassengerInfo p1 = new PassengerInfo("Vasya", "Pupkin", 654321);
        PassengerInfo p2 = new PassengerInfo("Dart", "Vader", 777777);

        FlightInfo f1 = new FlightInfo(7, 33, 1500, "Odessa", "Kiev", LocalDateTime.of(2018, 12, 25, 20, 00, 00));
        FlightInfo f2 = new FlightInfo(3, 01, 9000, "Tunis", "Kiev", LocalDateTime.of(2018, 12, 20, 03, 00, 00));

        Baggage b = new Baggage(3, 100);

        Meal m = new Meal("first course", 50, true);

        Ticket t1 = new Ticket(12345, p1, f1);
        Ticket t2 = new VipTicket(54321, p2, f2, b, m);

        System.out.println(t1.getPrice());
        System.out.println(((VipTicket) t2).getCommonPrice());

    }
}
