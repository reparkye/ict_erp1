package test;

public class ListTest {

	public static String[] split(String str, String aa) {
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
		}
		return null;
	}

	public static void main(String[] args) {
		String str = "aa-bb-cc-dd-ee";
		String[] strs = str.split("-");
		for (int i = 0; i < strs.length; i++) {
			// Character c = str.charAt(i);

			System.out.println("strs" + "[" + i + "]" + "=" + strs[i]);

		}
	}
}
