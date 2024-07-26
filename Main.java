import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a meal or [0] to Exit: \n");
        int userInput;
        do { 
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("4. Snack");
            System.out.println("0. Exit");
            userInput = scanner.nextInt();
            boolean flag = true;

            switch (userInput) {
                case 1:
                    System.out.println("Breakfast: ");
                    break;
                case 2:
                    System.out.println("Lunch: ");
                    break;
                case 3:
                    System.out.println("Dinner: ");
                    break;
                case 4:
                    System.out.println("Snack: ");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (true);


}