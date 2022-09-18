import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int n = sc.nextInt();
            String str = "" + n;
            int ans = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '4'){
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}
