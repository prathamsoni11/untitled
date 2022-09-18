package Challenges_String_done;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(maxFreq(str));
    }
    public static char maxFreq(String str){
        char[] charray = new char[26]; // To store freq of each character
        for(int i = 0;i < str.length();i++){
            charray[str.charAt(i) - 'a']++; //Updating freq each time
        }
        int max = 0;
        char ch = 'a';
        for(int i = 0;i < 26;i++){
            if(max <= charray[i]){ //Choosing max Freq Character
                max = charray[i];
                ch = (char)(i + 'a');
            }
        }
        return ch; // return character
    }

}
