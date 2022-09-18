package Challenges_Hashing_and_tries_done;

import java.util.HashMap;

public class string_window {
    /*
Ravi has been given two strings named string1 and string 2.
He is supposed to find the minimum length substring of the string1 which contains all the characters of string2.
Help him to find the substring

Input Format:-
The first line of the input contains string1.
String1 can be a string containing spaces also. The second line of the input contains string2.
String2 can be a string containing spaces also.
*/

    public static String minWindow(String s, String t) {

        HashMap map = new HashMap<>();

        for(int i = 0;i < t.length();i++){

            map.put(t.charAt(i), (int)map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int start = 0, count = 0;
        String res = "";

        for(int i = 0;i < s.length();i++){

            char chr = s.charAt(i);

            if(map.containsKey(chr)){

                map.put(chr, (int)map.get(chr) - 1);
                if((int)map.get(chr) >= 0) count++;
            }

            while(count == t.length()){

                if(res.length() == 0 || (i - start + 1) < res.length()) res = s.substring(start, i + 1);
                chr = s.charAt(start);

                if(map.containsKey(chr)){
                    map.put(chr, (int)map.get(chr) + 1);
                    if((int)map.get(chr) > 0) count--;
                }

                start++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("qwerty asdfgh qazxsw","qas"));

        //qwerty asdfgh qazxsw
        //qas
    }
}
