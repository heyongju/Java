package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); //ȫ�浿 Ű�� ���� ������ ���� �������� ������ ������ ��ü
		System.out.println("�� Entry ��: " + map.size());
		
		//��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));  //Ű�� ���� �˻�
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); //Key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String Key = keyIterator.next();
			Integer value = map.get(Key);
			System.out.println("\t" + Key + " : " + value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //map.entrySet ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String Key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + Key + " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear(); //��� map.entry ����
		System.out.println("�� Entry ��: " + map.size());
	}

}