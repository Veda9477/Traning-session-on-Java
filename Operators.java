package Alloperator;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no :");
		int b = sc.nextInt();
		
		System.out.println("a + b = "+(a + b) );
		System.out.println("a - b = "+(a - b) );
		System.out.println("a * b = "+(a * b) );
		System.out.println("a / b = "+(a / b) );
		System.out.println("a % b = "+(a % b) );
		
		System.out.println("a++  =" + (++a) );
		System.out.println("b--  =" + (--b));
		
		System.out.println("a == b ="+(a==b));
		System.out.println("a != b ="+(a!=b));
		System.out.println("a > b ="+(a>b));
		System.out.println("a < b ="+(a<b));
		System.out.println("b >= a ="+(b>=a));
		System.out.println("b <= a ="+(b<=a));

	}

}
