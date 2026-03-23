// BLOCK 4 – PROBLEM SOLVING (Intermediate)

// Move all zeros to end of array

// Input:
// [0,1,0,3,12]

// Output:
// [1,3,12,0,0]

// Solve in O(n) time without extra array.

import java.util.*;
public class MoveAllZeros{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zero=0;
        for(int i=0;i<n;i++){
        if(arr[i]!=0){
            int nonzero=arr[i];
            arr[i]=arr[zero];
            arr[zero]=nonzero;
            zero++;
        }
        }
        System.out.println(Arrays.toString(arr));
        }
}