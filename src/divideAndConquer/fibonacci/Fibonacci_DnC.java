package divideAndConquer.fibonacci;

public class Fibonacci_DnC {
	//get nth number in fibonacci series
	public int getFibonacci(int n) {
		if(n<1) {
			System.out.println("Enter a natural number.");
			return Integer.MIN_VALUE;
		}
		else if(n<=2) {
			return n-1;
		}else {
			return (getFibonacci(n-1)+getFibonacci(n-2));
		}
	}

	public static void main(String [] args) {
		Fibonacci_DnC  fib = new Fibonacci_DnC();
		System.out.println("5th Fibonacci is ---> " + fib.getFibonacci(5));
		System.out.println("6th Fibonacci is ---> " + fib.getFibonacci(6));
	}
}
