import java.util.Scanner;

public class Sumofeachdigit {


//program to input any five digit number and find sum of each digit number

    public static void main (String[]args){
        // variable for calculating sum
        int num, remainder, Sum = 0;

        Scanner scanner = new Scanner(System.in);
        // enter 34567
        System.out.println("Enter any number");
        num = scanner.nextInt();

        while (num > 0){
            // method adds the remainder to sum
            remainder = num % 10;
            Sum = Sum + remainder;
            num = num / 10;

        }
        System.out.println("Sum of digit of given num is" + Sum);



    }
}
