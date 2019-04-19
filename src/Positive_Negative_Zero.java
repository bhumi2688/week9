import java.util.Scanner;

public class Positive_Negative_Zero {

    // program to enter number till user wants and at the end it should disaplay count of positive, negative and zeros

    // main method
    public static void main (String[]args){


        int number,
        countPositive = 0, countNegative = 0, countZero = 0;

        char choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any integer number");
            number = scanner.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.println(" do you want to continue y/n?");
            choice = scanner.next().charAt(0);
        }
        while(choice =='y' || choice == 'n');

            System.out.println(" Positive number:" + countPositive);
            System.out.println(" Negative number:" + countNegative);
            System.out.println("countZero: + countZero");

    }
}
