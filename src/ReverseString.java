import java.util.Scanner;

public class ReverseString {
    // Program which prompts user for a string and prints the reverse of the string
    // enter cuteness output will look like reverse string ssenetuc
     // main method
    public static void main(String[] args) {
        String str; //variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string"); // cuteness
        str = scanner.nextLine();
        //System.out.println("Reverse of a string" + str + " is :")
        //for loop iterate from x=length of string to x>0
        for (int x = str.length(); x > 0; --x)
        {
            System.out.println(str.charAt(x - 1));
        }
    }

}







