package Searching;

public class ReverseanArray {
    public static void main(String[] args){
        int []arr = {1,2,3,4,5};
        int [] reverse =new int[arr.length];
        int j = 0;
        for (int i =  arr.length-1;i>=0;i--){
            reverse [j] = arr[i];
            j++;
        }
        for (int num:reverse) {
            System.out.println(num + " ");
        }
    }

}
