import java.util.*;

public class Problem_4 {
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); 
        ArrayList<Integer> palindromes = new ArrayList<>();
        
        int minRange = 99;
        int maxRange = 999;
        
        int max = 0;

        for(int i = minRange; i < maxRange; i++) {
            for(int j = i; j < maxRange; j++) {
                nums.add(j * i);
            }
        }

        for(Integer i : nums) { 
            if (isPalindrome(Integer.toString(i))) {
                palindromes.add(i);
            }
        }

        for(Integer i : palindromes) {
            // System.out.println(i); 
            if (i > max) {
                max = i; 
            }
        }
        System.out.println("");
        System.out.println(max);
    }

    public static boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
        
        return false;
    }
}
