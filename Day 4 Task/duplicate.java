import java.util.*;

public class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : arr){
            if(set.contains(num)){
                res.add(num);
            } 
            else{
                set.add(num);
            }
        }
        System.out.println(res);
    }
}