import java.util.Scanner;

public class fibonacciRecursion {
	public static void main(String args[]) {
		System.out
				.println("Enter the number upto which you want to print fibonacci series ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Fibonacci series upto " + number + " is: ");
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
