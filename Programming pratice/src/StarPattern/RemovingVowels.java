package StarPattern;

public class RemovingVowels {

	public static void main(String[] args) {
		String s="bangalore";
		String s1=" ";
		s1=s.replaceAll("[aeiou]"," ");
		System.out.println("String after removing vowel : "+s1);

	}

}
