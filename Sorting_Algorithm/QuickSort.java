package Sorting_Algorithm;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] sortedArr = quickSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }

    public static int[] quickSort(int[] arr){
        sorting(arr,0,arr.length-1);
        return arr;
    }

    public static void sorting(int[] arr,int  low,int high){
        if(low<high) {
            int pIndex = partition(arr, low, high);
            sorting(arr, low, pIndex - 1);
            sorting(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<= pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }

        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
