public class Meal {
    private String typeOfMeal;
    private long price;
    private boolean drink;

    public Meal(String typeOfMeal, long price, boolean drink) {
        this.typeOfMeal = typeOfMeal;
        this.price = price;
        this.drink = drink;
    }

    public String getTypeOfMeal() {
        return typeOfMeal;
    }

    public long getPrice() {
        return price;
    }

    public boolean isDrink() {
        return drink;
    }

    public long getPriceWithDrink(){
        if (drink == true) {
            return price + 10;
        }
        else return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "typeOfMeal='" + typeOfMeal + '\'' +
                ", price=" + price +
                ", drink=" + drink +
                '}';
    }
}
