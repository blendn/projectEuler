/*  
    1^2 + 2^2 + ... + 10^2 = 385
    (1^2 + 2^2 + ... + 10^2) = 55^2 = 3025
    3025 - 385 = 2640 
	What is the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. 
*/

public class Problem_6 {
	
	public static int sumOfSquares(int num) {
		int result = 0;
		for (int i = 1; i <= num; i++) {
		result += i * i;	
	}
		return result;
	}

	public static int squareOfTheSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		int result = sum * sum;
		return result;
	}

	public static void main(String[] args) {

		System.out.println(squareOfTheSum(100) - sumOfSquares(100));

	}

}
