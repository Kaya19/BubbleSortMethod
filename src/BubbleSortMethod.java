/*
Bubble Sort. Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
in this class you can see two different method to use bubble sort
 */
import java.util.*;
public class BubbleSortMethod {
    //Bubble sort method 1
    public static void sort(int [] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {// printing int array
            System.out.print(arr[i]+",");
        }
    }
    //***************************************************************************
    // Bubble Sort Method 2
    public static void sort2(int []arr) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : arr)//converting the int arr to array list
        {
            intList.add(i);
        }
        Collections.sort(intList);//sorting array list
        for (int i=0; i<intList.size();i++){// converting arry list to int array
            arr[i]=intList.get(i);
        }
        for (int i = 0; i < arr.length; i++) {//print int array
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args) {
        int[] arr={9,11,-5,0,10,3};//Sample mix int array. You can update as you want
        System.out.println("Method 1");
        sort(arr);
        System.out.println();
        System.out.println("Method 2");
        sort2(arr);
    }
}
