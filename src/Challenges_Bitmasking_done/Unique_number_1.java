package Challenges_Bitmasking_done;

public class Unique_number_1 {
    /*We are given an array containg n numbers. All the numbers are present twice except for one number which is only present once.
    Find the unique number without taking any extra spaces and in linear time. ( Hint - Use Bitwise )*/

    public static int singleNumber(int[] nums) {

        int val = 0;

        for(int i = 0;i < nums.length;i++){

            val = val ^ nums[i];
        }

        return val;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        System.out.println(singleNumber(nums));

        //7
        //1 1 2 2 3 3 4
    }
}
