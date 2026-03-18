import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str = s.toCharArray(); 
        int l=0;
        int r=str.length-1;
        while(l<r){
            char temp=str[l];
            str[l]=str[r];
            str[r]=temp;
        l++;
        r--;
        }
        String res=new String(str);
        System.out.println(res);
        
    }
}