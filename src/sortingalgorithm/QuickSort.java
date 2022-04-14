package sortingalgorithm;

import java.util.Arrays;

public class QuickSort {

    private static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition (int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            do{
                i++;
            }while (i<arr.length && arr[i]<=pivot);
            do{
                j--;
            }while(j>=0 && arr[j]>pivot);

            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);

        return j;
    }

    private static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int partition = partition(arr,low,high);
            quicksort(arr,low,partition);
            quicksort(arr,partition+1,high);
        }
    }

    public static void main(String[] args) {
        int []arr = new int[]{11,12,3,41,5};
        quicksort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
