package jp;

public class TestJava {

    private static int[] arr = {7,1,5,3,6,4};

    public static void main(String[] args) {

    }

    private static int maxProfit(int[] arr){

        int buyIndex = 0;
        int sellIndex = 1;
        int buyValue = -1;

        for(int i = 0; i < arr.length - 1; i ++){
            if(arr[buyIndex] < arr[buyIndex + i]){
                buyValue = arr[buyIndex + i];
            }
        }
        return 0;
    }

}
