import java.util.Date;

/**
 * Employees class, in which personal information is given such as name, surname, inherited from the Person class,
 * and additional information from this class, such as salary and job position.
 * @author Daniela Lozano
 */
public class Employee extends Person{
    protected double salary;
    private String workPosition;

    public Employee(String name, String lastName1, String lastName2, Date dateBirth, float height, double salary, String workPosition) {
        super(name, lastName1, lastName2, dateBirth, height);
        this.salary = salary;
        this.workPosition = workPosition;
    }

    /**
     * This is the get method, of the protected variable of salary
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Assigns value with the set method, to the salary variable
     * @param salary receives the salary to assign the value
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * This is the get method, of the private variable of workPosition
     * @return the job position of the employee
     */
    public String getWorkPosition() {
        return workPosition;
    }

    /**
     * Assigns value with the set method, to the workPosition variable
     * @param workPosition receives the job position to assign the value in the variable workPosition
     */
    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    /**
     * Prints the data of the class Employee
     * @return important employee data such as name, surname, date of birth and job position.
     */
    @Override
    public String toString() {
        return "Employee information: " + name + " " + lastName1 + " " + lastName2 + " Fecha de Nacimiento: " + dateFormat() + " Work position: " + workPosition;
    }
}
