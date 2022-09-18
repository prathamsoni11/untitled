package Lecture6_Recursion;

public class Recursion {
    public static void main(String[] args) {
//        PD(5);
//        PI(5);
//        PDI(5);
//        PDISkip(5);
//        System.out.println(Fact(4));
//        System.out.println(power(2,5));
//        System.out.println(fibonacci(6));
//        int[] array = {3,8,6,1,9,7};
//        System.out.println(isSorted(array,0));
//        int[] array = {6,8,1,1,8,3,4};
//        System.out.println(firstIndex(array,0,8));
//        System.out.println(lastIndex(array,0,8));
//        pattern(5,1,1);
//        pattern2(5,1,1);
//        int[] array = {3,8,6,1,9,7};
//        int[] array = {50,40,30,20,10};
//        bubbleSort(array,0, array.length-1);
//        display(array);
        int[] array = {3,8,1,8,8,4};
        int[] ans = allIndices(array,0,8,0);
        display(ans);
    }
    public static void PD(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
    public static void PI(int n){
        if(n == 0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
    public static void PDI(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }
    public static void PDISkip(int n){
        if(n == 0){
            return;
        }
        if(n%2 == 1) {
            System.out.println(n);
        }
        PDISkip(n-1);
        if(n%2 == 0) {
            System.out.println(n);
        }
    }
    public static int Fact(int n){
        if(n == 1){
            return 1;
        }
        int fnm1 = Fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        int pnm1 = power(x,n-1);
        int pn = x*pnm1;
        return pn;
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static boolean isSorted(int[] arr , int si){
        if(si == arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        else {
            boolean restAns = isSorted(arr, si+1);
            return restAns;
        }
    }
    public static int firstIndex(int[] arr , int si , int data){
        if(si  == arr.length){
            return -1;
        }
        if(arr[si] == data){
            return si;
        }else {
            int restAns = firstIndex(arr,si+1,data);
            return restAns;
        }
    }
    public static int lastIndex(int[] arr , int si , int data){
        if(si  == arr.length){
            return -1;
        }
        int index = lastIndex(arr,si+1,data);
        if(index == -1){
            if(arr[si] == data){
                return si;
            }
            else {
                return -1;
            }
        }
        else {
            return index;
        }
    }
    public static void pattern(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            pattern(n,row+1,1);
            return;
        }
        System.out.print("*");
        pattern(n,row,col+1);
    }
    public static void pattern2(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col<=n-row+1){
            System.out.print("*");
            pattern2(n,row,col+1);
            return;
        }
        System.out.println();
        pattern2(n,row+1,1);
    }
    public static void bubbleSort(int[] arr , int si , int li){
        if(li == 0){
            return;
        }
        if (si == li){
            bubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si] > arr[si+1]){
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
        }
        bubbleSort(arr,si+1 , li);
    }
    public static int[] allIndices(int[] arr,int si,int data,int count){
        if(si == arr.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si] == data){
            indices = allIndices(arr,si+1,data,count+1);
        }
        else{
            indices = allIndices(arr,si+1,data,count);
        }
        if(arr[si] == data){
            indices[count] = si;
        }
        return indices;
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
