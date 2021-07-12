import java.util.InputMismatchException;
import java.util.Scanner;
public class program{

	

	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter some number : ");
			try {
				num = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("The Program Exited cuz u didn't enter a number:|");
				System.exit(1);
			}
			isRadicali(num);
		}
	}
	static void isRadicali(int num){
		double num2 = Math.pow(num,0.5);
		if(num2 % 1 == 0){
			System.out.println("It's Radical");
		}
		else{
			System.out.println("It's not Radical");
		}

	}

}