import java.util.Scanner;

public class MultiplicationTable_5 {

    //print single multiplication table using do while loop
    // given table of 5

    // main method
    public static void main (String[]args){
        int num;// table of 5
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number ");
      num = scanner.nextInt();
      //i = 1 to 10
      int i = 1;

      do {
          i++;
          System.out.println(num + "x" + i + " = " + num * i);

      }
       while (i < 10);



    }

}
