package Challenges_Recursion_done;

public class Smart_keypad_1 {
    /*

You will be given a numeric string S. Print all the possible codes for S.

Following vector contains the codes corresponding to the digits mapped.

string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

For example, string corresponding to 0 is " " and 1 is ".+@$"
*/
    static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void keypad1(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }


        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        String code = table[ch - '0'];

        for (int i = 0; i < code.length(); i++)
            keypad1(ros, ans + code.charAt(i));

    }

    public static void main(String[] args) {
        keypad1("12","");


        //12

        //Explanation
        //For code 1 the corresponding string is .+@$ and abc corresponds to code 2.
    }
}
