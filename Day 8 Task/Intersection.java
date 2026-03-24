// BLOCK 4 – PROBLEM SOLVING

// Find the intersection of two arrays

// Input:
// arr1 = [1,2,3,4,5]
// arr2 = [3,4,5,6,7]

// Output:
// [3,4,5]

import java.util.*;
class Intersection{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int arr2[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    } 
}
