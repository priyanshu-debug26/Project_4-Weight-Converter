import java.util.Scanner;

public class main {
    public static void main(String[] args){

        // WEIGHT CONVERTER PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter Program");
        System.out.println("1: lbs to kgs");
        System.out.println("2: kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("The converted weight in kgs is: %.2f kgs",newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The converted weight in kgs is: %.2f lbs", newWeight);
        }
        else {
            System.out.println("Choice not available.");
        }
    }
}
