public class PrimeNumber {

    // to check if it is a Prime Number or not(divisible by 1 or itself)
    // number to check if it prime number or not
     //main method
    public static void main(String[] args) {
        int x = 16;
        int y = 3; //any number
        //will declare false condition
        boolean temp = false;

        for (y = 3; y <= x / 3; ++y) {
            if (x % y == 0) {
                temp = true; // will declare true condition
            }
        }
        if (!temp)
            System.out.println(x + " is a prime number");
        else
            System.out.println(x + " is not a prime number");
    }
}

