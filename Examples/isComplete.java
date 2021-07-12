import java.lang.reflect.WildcardType;
import java.util.Scanner;
class GFG {

	static boolean isComplete(int num){
		int com=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				com+=i;
			}
		}
		if(com==num)
			return true;
		else 
			return false;
	}
	public static void main(String args[]) { 
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = myScanner.nextInt();
		System.out.println(isComplete(number));
		
    } 
} 