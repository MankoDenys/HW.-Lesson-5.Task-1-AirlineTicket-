public class Ticket {
    private int numberTicket;
    private PassengerInfo passengerInfo;
    private FlightInfo flightInfo;

    public Ticket(int numberTicket, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.numberTicket = numberTicket;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public long getPrice() {
        return flightInfo.getPrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numberTicket=" + numberTicket +
                ", passengerInfo=" + passengerInfo +
                ", flightInfo=" + flightInfo +
                '}';
    }
}
