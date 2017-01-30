/**
 * Created by MacbookStudioPro on 1/30/17.
 * This class tracks various characteristics of Animals
 */
public class Animals {

    String animalType;
    String animalSpecies;
    boolean isPoisonous;
    boolean canFly;
    boolean isEndangered;

    public static void main(String[] args) {

        Animals a1 = new Animals();
        a1.animalType = "mammal";
        a1.animalSpecies = "Black Rhino";
        a1.isEndangered = true;
        a1.canFly = false;
        a1.isPoisonous =false;

        System.out.println("The " + a1.animalSpecies + " is a " + a1.animalType + ".");

        if (a1.isEndangered == true){
            System.out.println("This animal is endangered.");
        } else {
            System.out.println("This animal is not endangered.");
        }

        if (a1.canFly == true){
            System.out.println("This animal can fly.");
        } else {
            System.out.println("This animal cannot fly.");
        }

        if (a1.isPoisonous == true){
            System.out.println("This animal is poisonous. Proceed with caution.");
        } else {
            System.out.println("This animal is not poisonous.");
        }

    }

}
