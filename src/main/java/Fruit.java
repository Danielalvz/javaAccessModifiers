import java.util.ArrayList;

/**
 * Fruit class, details information about the fruit in general such as name, weight and colors
 * @author Daniela Lozano
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * This is the get method, of the list colors
     * @return the colors of the list
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Assigns value with the set method, to the colors list
     * @param colors receives the colors to assign the value in the arrayList
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
