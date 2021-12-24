import java.util.*;

public class Problem_3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>(); 
        
        int i = 2; 
        long num = 600851475143L;
        
        while(i <= num) {
            if(num % i != 0) i++; 
            if(num % i == 0) {
                num = num / i; 
                System.out.println(i);
                primes.add(i);
            }  
       
        } 
        System.out.println("Largest prime factor is: "+ primes.get(primes.size() - 1));
    
    } 
   
    
}
