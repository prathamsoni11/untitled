package Challenges_Recursion_done;

import java.util.Scanner;

public class Recursion_keypad_codes {
    /*

    Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.

    Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

    E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

    a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

    b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

    */


    static int cnt = 0;
    static String keypad[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

    static void keypadCode(String inp, String out, int i) {
        // Base case
        if (i == inp.length()) {
            System.out.print(out + " ");
            cnt++;
            return;
        }

        // Rec case
        int r = inp.charAt(i) - '0';
        for (int k = 0; k < keypad[r].length(); k++) {
            char ch = keypad[r].charAt(k);
            keypadCode(inp, out + ch, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        String output = new String();
        keypadCode(inp, output, 0);
        System.out.println("\n" + cnt);

        // 12
    }
}
