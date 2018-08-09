package test;

public class Test {

	public static int indexOf(String str,String str1) {
		for(int i=0; i<str.length(); i++) {
		Character c = str.charAt(i);
			if(c.toString().equals(str1)) {    //
			return i;
	}
	}
		return -1;
	}
	
	
	public static int lastIndexOf(String str,String str1) {
		for(int i=str.length(); i>=0;i--) {
		Character c = str.charAt(i);
		if(c.toString().equals(str1)) {
		return i;
	}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "a,b,c";
		int idx = indexOf(str,",");
		System.out.println(",�� ù���� ��ġ : " + idx);
		idx = indexOf(str,"d");
		System.out.println(",�� ù���� ��ġ : " + idx);
		idx = lastIndexOf(str,",");
		//System.out.println(",�� ù���� ��ġ : " + idx);
		//int cnt = count(str,",");
		//System.out.println(",�� ����" + cnt);
	}
}


	
	
	/*public static int indexOf(List<String> ls, String str) {
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).equals(str)) {
				return i;
			}
		}
		return -1;
	}	
	
	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		
		System.out.println(indexOf(ls,"c"));
	}
}*/