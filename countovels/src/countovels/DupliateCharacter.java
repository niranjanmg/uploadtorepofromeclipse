package countovels;

public class DupliateCharacter {

	public static void main(String[] args) {
		String s="aabcsgs";
		String output=" ";
		System.out.println("with duplicate:"+ s);
		for(int i=0; i<s.length();i++){
			String s1=s.charAt(i)+"";
			if(output.indexOf(s1)==-1)
			{
				output=output+s1;
			}
		}
		System.out.println("without duplicate:" +output);
	}

}
