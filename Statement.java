package Day;
import java.util.*;
public class Statement {

	public static void main(String[] args) {
		String answer;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("currently is the starting point for great adventure");
		System.out.println("Enetr the quatity");
		int quatity = sc.nextInt();
		System.out.println("Enetr the price");
		int price = sc.nextInt();
		double total = quatity*price;
		System.out.println("Total is"+total);
		
		System.out.println("***********************");
		
		System.out.println("Do you want to perform again");
		answer = sc.next();
		}while(answer.equals("Yes"));


			}

}