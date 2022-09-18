package Lecture4_2DArray_ArrayList;


public class WaveArray {
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},
                       {21,22,23,24},
                       {31,32,33,34},
                       {41,42,43,44}};
        WavePrintRowWise(arr);
    }
    public static void WavePrintRowWise(int[][] arr){
        for(int i = 0 ; i<= arr.length-1 ; i++){
            if(i%2 == 0){
                for(int j = 0 ; j<=arr[i].length-1 ; j++){
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for(int j = arr[i].length-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
    }
}
