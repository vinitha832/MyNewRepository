package Lamda_vjit;
import java.util.Scanner;
import java.util.function.Function;
public class LambdaFactorial {

	public static int factorial(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			 res=res*i;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num for factorial");
		int n=sc.nextInt();
		Function<Integer,Integer> fact= LambdaFactorial::factorial;
		System.out.println("factorial = "+fact.apply(n));
		
		sc.close();
	}
}
