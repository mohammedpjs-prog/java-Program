package Searching;

public class DuplicateSorting {
    public static void main(String[] args){
        int [] arr = {1,1,1,1,2,3,33,44,55,55,66};
        int i =0;
        for (int j =1; j<arr.length;j++){
           if( arr[i] != arr[j]){
               i++;

               arr[i]=arr[j];
           }
        }
        for (int k =0; k<=i;k++)
        System.out.println(arr[k]+ " ");
        }
    }

