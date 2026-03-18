import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
         int num=n;
        while(num>0){
           int  remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        if(n==reverse){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
