import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quick sort algorithm---------!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
           return;
       }
       int pivot = arr[highIndex];
       int leftPointer = lowIndex;
       int rightPointer = highIndex ;

       while (leftPointer < rightPointer){
           while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
           }
           while(arr[rightPointer] >= pivot && leftPointer < rightPointer ){
               rightPointer--;
           }
           swap(arr, leftPointer, rightPointer);
       }
       swap(arr, leftPointer, highIndex);
       quickSort(arr, lowIndex, leftPointer - 1);
       quickSort(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int leftPointer, int rightPointer) {
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[rightPointer];
        arr[rightPointer] = temp;
    }
}





























