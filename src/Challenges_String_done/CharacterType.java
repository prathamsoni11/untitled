package Challenges_String_done;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        System.out.println(tell(ch));
    }
    public static char tell(char ch) {

        if(ch >= 'a' && ch <= 'z')
            return 'L';
        else if(ch >= 'A' && ch <= 'Z')
            return 'U';
        else
            return 'I';

    }
}
