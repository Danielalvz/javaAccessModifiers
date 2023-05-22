import java.util.ArrayList;

/**
 * The Strawberry class, details characteristics of the fruit,
 * inheriting some data from the fruit class,
 * and adding other data such as price and quantity.
 * @author Daniela Lozano
 */
public class Strawberry extends Fruit{

    private double price;
    private int quantity;

    public Strawberry(String name, float averageWeight, ArrayList<String> colors, double price, int quantity) {
        super(name, averageWeight, colors);
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * This is the get method, of the private variable of price
     * @return the price of the strawberry
     */
    public double getPrice() {
        return price;
    }

    /**
     * Assigns value with the set method, to the price variable
     * @param price receives the price to assign the value in the variable price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This is a function that calculates the total purchase of the strawberry, multiplying quantity by price
     * @return the total purchase
     */
    public double totalPurchase() {
        double total = price * (double) quantity;
        return total;
    }

    /**
     * Prints the data of the class Strawberry
     * @return some details of the fruit such as name, price, quantity and total
     */
    @Override
    public String toString() {
        return name + " Price: $" + price + " Quantity: " + quantity + " Total purchase: $" + totalPurchase();
    }
}
