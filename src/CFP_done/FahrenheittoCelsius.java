package CFP_done;

import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fmin = scn.nextInt();
        int fmax = scn.nextInt();
        int fstep = scn.nextInt();
        int fcurrent = fmin;
        while(fcurrent<=fmax){
            int celsius = (int)((5.0/9)*(fcurrent-32));
            System.out.println(fcurrent+"\t"+celsius);
            fcurrent = fcurrent+fstep;
        }
    }
}
