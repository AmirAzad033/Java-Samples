import java.util.Locale;
import java.util.Scanner;

public class CheckFirstLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arrayy = new String[5];
		for (int i = 0; i < arrayy.length; i++) {
			System.out.print("Enter the " + i + " th name : ");
			arrayy[i] = scanner.nextLine();
		}
		System.out.println("Matched Names :"+returnIsFirstLetterEqual(arrayy));
	}
	static String returnIsFirstLetterEqual(String[] forCArray){
		String forReturn = "" , firstLetterOfIndex , lastLetterOfIndex;
		int[] indexes = new int[forCArray.length];
		String[] forCheckArray = new String[5] , firstLetters = new String[forCheckArray.length],lastLetters =
				new String[forCheckArray.length];
		for (int x = 0; x < forCheckArray.length; x++) {
			forCheckArray[x] = forCArray[x].toLowerCase();
		}
		for (int i = 0; i < forCheckArray.length; i++) {
			firstLetters[i] = ""+forCheckArray[i].charAt(0);
			lastLetters[i] = ""+forCheckArray[i].charAt(forCheckArray[i].length() - 1);
		}
		for (int e = 0; e < forCheckArray.length; e++) {
			firstLetterOfIndex = "" + forCheckArray[e].charAt(0);
			lastLetterOfIndex = "" + forCheckArray[e].charAt(forCheckArray[e].length() - 1);
			for (int i = 0; i < forCheckArray.length; i++) {
				if(firstLetterOfIndex.equals(firstLetters[i])&&lastLetterOfIndex.equals(lastLetters[i])){
					indexes[i]++;
				}
			}
		}
		for (int p = 0; p < indexes.length; p++) {
			if(indexes[p] >= 2){
				forReturn = forReturn +" "+ forCArray[p];
			}
		}
		return forReturn;

	}
}
