import java.util.*;
public class Main {
    public static void FirstNonrepeating(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int n = s.length();
        while (left < n) {
            int right = 0;
            int count = 0;
            while (right < n){
                if (s.charAt(left) == s.charAt(right)) {
                    count++;
                }
                right++;
            }
            if (count == 1){
                System.out.println(s.charAt(left));
                return;
            }
            left++;
        }
        System.out.println("No non-repeating character");
    }
}
