public class VipTicket extends Ticket{
    private Baggage baggage;
    private Meal meal;

    public VipTicket(int numberTicket, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(numberTicket, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }
    public long getCommonPrice() {
        return getPrice()+baggage.summBag()+meal.getPriceWithDrink();
    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "baggage=" + baggage +
                ", meal=" + meal +
                '}';
    }
}
