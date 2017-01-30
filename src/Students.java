/**
 * Created by Ben Maxwell on 1/30/17.
 * This class tracks student enrollment information
 *
 */
public class Students {

    String name;
    String courseOfStudy;
    boolean paidInFull; //Has the student's account been paid in full
    double balanceOwed;
    


    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "John Smith";
        s1.courseOfStudy = "Engineering";
        s1.paidInFull = false;
        s1.balanceOwed = 800.57;


        System.out.println(s1.name + " is studying " + s1.courseOfStudy);


        if (s1.paidInFull == false) {
            System.out.println("This student has a remaining balance of " + s1.balanceOwed);
        } else {
            System.out.println("This student is in good standing!");

        }


    }
}

