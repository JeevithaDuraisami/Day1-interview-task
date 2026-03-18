import java.util.*;
public class ValidPalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str=s.toLowerCase().replaceAll(" ","");
        int left=0;
        int right=str.length()-1;
        boolean ispalin=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalin=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalin){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}