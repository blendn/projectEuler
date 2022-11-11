public class Problem_5 {

    public static void main(String[] args) {
        outer:  
        for (int i = 1; i <= 2147483647; i++) {
            for (int j = 20; j >= 1; j--) {
                if (i % j != 0) {
                    continue outer;
                } else if (j == 1) {
                    System.out.println(i); 
                    break outer;
                }
            }
        }
    }
}

