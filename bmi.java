import java.util.Scanner;

public class StarFitnessClub {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kg");
        double weight = input.nextDouble();

        System.out.println("Enter height in cm");
        double height = input.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));
        System.out.printf("Your BMI is %.2f. ", bmi);

        if (bmi >= 25) {
            System.out.println("You are overweight");
            double kgs = (bmi - 25) * ((height / 100) * (height / 100));
            System.out.printf("Reduce %.2f kg to be fit", kgs);
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy");
        } else {
            System.out.println("You are underweight");
            double kgs = (18.5 - bmi) * ((height / 100) * (height / 100));
            System.out.printf("Gain %.2f kg to be fit", kgs);
        }
    }
}
