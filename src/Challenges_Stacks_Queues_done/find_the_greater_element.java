package Challenges_Stacks_Queues_done;

import java.util.Stack;

public class find_the_greater_element {
    /*
    We are given a circular array, print the next greater number for every element. If it is not found print -1 for that number.
    To find the next greater number for element Ai , start from index i + 1 and go uptil the last index after which we start looking for the greater number from the starting index of the array since array is circular.
    */

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] ans = nextGreaterElements(nums);
        for (Integer item: ans){
            System.out.print(item+" ");
        }

        //3
        //1 2 3
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];

        Stack stack = new Stack<>();

        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[(int) stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = (stack.isEmpty() ? -1 : nums[(int) stack.peek()]);
            stack.push(i % nums.length);
        }

        return res;

    }
}
