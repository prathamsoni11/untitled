package Section22_BitMasking;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(extractBit(22,5));
        System.out.println(setBit(21,4));
        System.out.println(resetBit(21,3));
        System.out.println(rightmostSetBit(6));
    }
    public static int extractBit(int n, int i){
        int mask = 1;
        mask = 1 << (i-1);
        n = n & mask;

        return (n == 0 ? 0 : 1);
    }
    public static int setBit(int n, int i){
        int mask = 1;
        mask = 1 << (i-1);
        n = n | mask;

        return n;
    }

    public static int resetBit(int n, int i){
        int mask = 1;
        mask = ~(1 << (i-1));
        n = n & mask;

        return n;
    }

    public static int rightmostSetBit(int n){
        int pos = 1;
        int mask = 1;
        while((n & mask) == 0){
            pos++;
            mask = mask << 1;
        }
        return pos;
    }

}
