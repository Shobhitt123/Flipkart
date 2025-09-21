package com.shobhit.javapractice;

public class FindVowelAndConsonent {

	public static void main(String[] args) {
		String s = "sjsksks";
		FindVobleAndConso(s);
	}

	public static void FindVobleAndConso(String s) {

		int vovleCount = 0;
		int consoCont = 0;

		for (char ch : s.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovleCount++;

			} else {
				consoCont++;

			}
		}
		System.out.println(vovleCount + " = vowel count");
		System.out.println(consoCont + " = consonent count");

	}
}
