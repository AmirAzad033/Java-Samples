import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter a number to reverse it : ");
		int numberValueToReverse = new Scanner(System.in).nextInt();
		returnReverse(numberValueToReverse);
	}
	static void returnReverse(int a){
		int b = 0;
		System.out.println("b is : " + b + " and A is " + a);
		while(a != 0){
			b = b * 10 + a % 10;
			a = a / 10;
			System.out.println("b is : " + b + " and A is " + a);
		}
		System.out.println("The reversed value of your entered number is : " + b);
	}

}
