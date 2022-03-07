package sortingalgorithm;

public class MergeSort {

    private static void merge(int arr[],int l, int r){

        int m = (l+r)/2;

        int lSize = m - l + 1;
        int rSize = r - m;

        int L[] = new int [lSize];
        int R[] = new int [rSize];

        for(int i =0;i<lSize;i++){
            L[i] = arr[l+i];
        }

        for(int i =0;i<rSize;i++){
            R[i] = arr[m+i+1];
        }

        int i = 0 , j =0 , k =l;

        while(i<lSize && j<rSize){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<lSize){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<rSize){
            arr[k]=R[j];
            j++;
            k++;
        }

    }

    private static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,r);
        }
    }

    public static int[] mergeSort(int arr[]){

        mergeSort(arr,0,arr.length-1);

        return arr;
    }

}
