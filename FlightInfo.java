import java.time.LocalDateTime;

public class FlightInfo {
    private int numberFlight;
    private int numberSeat;
    private long price;
    private String arrival;
    private String departure;
    private LocalDateTime timeOfDispatch;

    public FlightInfo(int numberFlight, int numberSeat, long price, String arrival, String departure, LocalDateTime timeOfDispatch) {
        this.numberFlight = numberFlight;
        this.numberSeat = numberSeat;
        this.price = price;
        this.arrival = arrival;
        this.departure = departure;
        this.timeOfDispatch = timeOfDispatch;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public long getPrice() {
        return price;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public LocalDateTime getTimeOfDispatch() {
        return timeOfDispatch;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "numberFlight=" + numberFlight +
                ", numberSeat=" + numberSeat +
                ", price=" + price +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", timeOfDispatch=" + timeOfDispatch +
                '}';
    }
}
