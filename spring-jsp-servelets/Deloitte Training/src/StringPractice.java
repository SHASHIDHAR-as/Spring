
public class StringPractice {

	public static void main(String[] args) {
		String s="Shashi";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		s=s.substring(0, 3);
		System.out.println(s);
		
		String st="";
		for(char  a='A';a<='Z';a++) {
			st+=a;
		}
		System.out.println(st);

	}

}
