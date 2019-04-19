public class ArmstrongNumber {
     // program to check whether number is armstrong number or not
    // main method
    public static void main (String[]args){
        int x = 157; // number to check weather its Armstrong number or not
        int y = 0;
        int z; // variable to create 7
        int temp = x; //create new variable for x

        while(x>0)
        {
            z = x % 10;//get value of 7
            x = x / 10; //excluded 7 ,now 15 left
            y = y + z * z* z; // z value of 7
        }
        if (temp==y)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is not an Armstrong number");

    }


}
