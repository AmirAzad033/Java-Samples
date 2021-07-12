import java.util.Scanner;

public class EnigmaReflector {
	public static void main(String[] args) {
		String AlphaBet = "abcdefghijklmnopqrstuvqxyz";
		while(true) {
			char Enigma = new Scanner(System.in).nextLine().charAt(0);
			String position =""+ AlphaBet.charAt(2);
			System.out.println(Enigma + "" + position);
		}
	}
	static String Reflector(char character){
		String AlphaBet = "abcdefghijklmnopqrstuvqxyz";
		String forCheck = "" + character;
		String forReturn = "";
		int leength = AlphaBet.length() - 1;
		System.out.println(leength);

		if(!AlphaBet.contains(forCheck))
			return "Should to Enter a String , Not a Number!";
		else {
			int position = AlphaBet.charAt(character);
			System.out.println(position);
			int positionForReturn = leength - position;
			System.out.println(positionForReturn);
			forReturn = ""+ AlphaBet.charAt(positionForReturn);
			return "Salam Khoobi";

		}
	}
}
