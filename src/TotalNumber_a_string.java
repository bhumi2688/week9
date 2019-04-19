public class TotalNumber_a_string {
    // program to enter any string and count total number of a String
    // main method

    public static void main(String[]args){
        // input string name
        String input = "ananya";
        int charCount = 0;
        int x = 0;
        for (x=0; x<input.length(); x++){
            if (input.charAt(x) =='a'){
                charCount++;

            }
        }

        System.out.println("count of character 'a' on string " + charCount);
    }
}
