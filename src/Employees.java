/**
 * Created by Ben Maxwell on 1/30/17.
 * This class tracks pertinent employee information
 *
 */
public class Employees {

    String name;
    String department;
    int yearOfHire;
    String positionTitle;
    boolean isManager;


    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.name = "Jenny Johnson";
        e1.department = "Human Resources";
        e1.positionTitle = "Director of Talent Management";
        e1.isManager = false;
        e1.yearOfHire = 2001;

        System.out.println(e1.name + " is " + e1.positionTitle + ".\nThey were hired in " + e1.yearOfHire);

        if (e1.isManager == true){
            System.out.println("They are a part of the management team");
        } else {
            System.out.println("They are a valued staff member");
        }


    }


}
