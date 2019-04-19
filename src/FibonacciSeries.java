import java.util.Scanner;

public class FibonacciSeries {
    // program to print fibonacci series of n terms
    // fibonacci series 1 1 2 3 5 8 13 24, adds 0+1 1+1 2+1
    // main method
    public static void main (String[]args){
        //n value is 45
        int a = 0, n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the fibonacci series upto n terms");
        n = scanner.nextInt();
        int c = 0;
        int d = 1;

        while(a<=n){
            c = d;
            d = a;
            a = c + d;


            System.out.println("febonacci series upto n is " + a);

        }
        
    }

}
