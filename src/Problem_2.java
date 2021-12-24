//import java.util.*; 

public class Problem_2 { 
    
    public static void main(String[] args) {
    
        int sum = 0;
        int x, y, z;
        x = 0;
        y = 1; 

        while(x <= 4000000) { 
            z = x + y;
            x = y;
            y = z; 
            if (x % 2 == 0) sum = sum + x;
            
        }

        System.out.println(sum);
    }
}

