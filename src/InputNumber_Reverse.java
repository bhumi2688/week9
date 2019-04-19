import java.util.Scanner;

public class InputNumber_Reverse {

    // input number and reverse it and print it using while loop

    //main method
    public static void main (String[]args){
        int num = 0;
        int reversenum = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number"); // 2688
        num = scanner.nextInt();
             // condition
        while (num != 0){

            reversenum = reversenum *10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse of number is  " + reversenum);
    }
}
