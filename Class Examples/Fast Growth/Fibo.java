import java.util.Scanner;

public class Fibo {
	public static int fib1(int n){
		if((n==0) || (n==1))
			return n;
		else
			return fib1(n-1)+fib1(n-2);
	}
	public static void main (String arg[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Number: ");
		int n = in.nextInt();
		System.out.println("Resultado: " + fib1(n));
		in.close();
	}
}