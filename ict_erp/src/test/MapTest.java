package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("�̸�", "��浿");
		map.put("����", "33");
		map.put("�ּ�", "����");
		map.put("���̵�", "�Ѹ�");
		map.put("���", "1111");
		
		System.out.println(map);
		List<Map<String,String>> mapList;
		mapList = new ArrayList<Map<String,String>>();
		mapList.add(map);
		System.out.println(mapList);
	}
}
