package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "김두한");
		map.put("나이", "33");
		map.put("취미", "게임");
		map.put("주소", "종로");
		map.put("넘버", "1111");
		
		System.out.println(map);
		List<Map<String,String>> mapList;
		mapList = new ArrayList<Map<String,String>>();
		mapList.add(map);
		System.out.println(mapList);
	}
}
