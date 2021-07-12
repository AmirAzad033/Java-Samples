import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter a number pls : ");
		boolean isZoj = new Scanner(System.in).nextInt() % 2 == 0 ? true : false;
		System.out.println(isZoj);
	}

}
