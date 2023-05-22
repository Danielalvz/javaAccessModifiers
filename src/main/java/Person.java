import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The person class is a template that details some general data such as first name, last name, date of birth and height.
 * @author Daniela Lozano
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * This is the get method, of name variable
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Assigns value with the set method, to the name variable
     * @param name receives the name to assign the value in the variable
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Transforms the date entered as Date, to a simple format of dd/MM/yyyy
     * @return the date in the format dd/MM/yyyy type string
     */
    public String dateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = sdf.format(dateBirth);
        return dateString;
    }
}
