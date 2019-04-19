import java.util.Scanner;

public class SingleMultiplication_forloop {

    // print single multiplication table using for loop
    // given number is 5

    // main method
    public static void main (String[]args){
       // num = 5
        int num;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        num = scanner.nextInt();
        // j is variable, j<= is condition, j++ is increment
        for (j = 1; j <= 10; j++)
            System.out.println(num + " * " + j + " = " + (num*1));
    }
}
