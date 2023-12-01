import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Write a function that takes an integer as input,
        and returns the number of bits that are equal to one
        in the binary representation of that number.
        You can guarantee that input is non-negative.

        Example: The binary representation of 1234 is 10011010010,
        so the function should return 5 in this case
         */

        System.out.println(countBits(1234));
    }
    public static int countBits(int n){
        //let's find the binary representation of n first
        int remainder = n % 2;
        n = n / 2;
        List<Integer> representationOfNum = new ArrayList<>();
        representationOfNum.add(remainder);
        while(n!= 0){
            remainder = n % 2;
            n = n / 2;
            representationOfNum.add(remainder);
        }
        //spot shows us the spot of the number in the binary representation
        //let's write the binary representation of n now that we have the arrayList and have the spot to use
        int count = 0;
        for (Integer integer : representationOfNum) {
            if (integer == 1) {
                count++;
            }
        }
        return count;
    }

}