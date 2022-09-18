package Challenges_Bitmasking_done;

public class Unique_number_2 {
    /*We are given an array containg n numbers.
    All the numbers are present twice except for two numbers which are present only once.
    Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )*/

    public int[] singleNumber(int[] nums) {
        // Pass 1 :
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;

        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }

    public static void main(String[] args) {

        //4
        //3 1 2 1
    }
}
