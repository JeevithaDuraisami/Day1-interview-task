// BLOCK 5 – DATA STRUCTURES & ALGORITHMS

// Topic: Sorting

// Problem – Bubble Sort

// Sort the array:
// [5,2,9,1,5,6]

// Python Logic

// def bubbleSort(arr):
//     n = len(arr)
//     for i in range(n):
//         for j in range(0, n-i-1):
//             if arr[j] > arr[j+1]:
//                 arr[j], arr[j+1] = arr[j+1], arr[j]

// Time Complexity: O(n^2)

import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int n1:arr){
            System.out.print(n1+" ");
        }
    }
}