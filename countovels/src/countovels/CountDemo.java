package countovels;

public class CountDemo {

	public static void main(String[] args) {
		int vowels = 0;
		int consonents = 0;
		// int i;

		String str1 = "cOuntDEmo";
		str1 = str1.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
			char ch=str1.charAt(i);

			if ( ch== 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				vowels++;

			}

			// else if(str1.charAt(i)>='a'&& str1.charAt(i)<='z'){
			// consonents++;

			//else {
				// System.out.println("print");

			//}

		}

		System.out.print("no of vowel=" + vowels);

	}
}