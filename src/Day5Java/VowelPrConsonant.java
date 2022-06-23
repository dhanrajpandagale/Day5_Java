package Day5Java;

import java.util.Scanner;

public class VowelPrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Aplhabet");
		char a = sc.next().charAt(0);
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'  || a == 'A'  || a == 'E' || a == 'I' || a == 'o' || a == 'u')
		{
			System.out.println("Alphabet is Vowel");
		}
		else
		{
			System.out.println("Alphabet is Consonant");
		}
		// TODO Auto-generated method stub

	}

}
