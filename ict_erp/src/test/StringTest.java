package test;

public class StringTest {

	public static void main(String[] args) {
		String str = "a,b,c,d,e";
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
//			if(c.toString)
			System.out.println(c);
		}
		
	}
}

