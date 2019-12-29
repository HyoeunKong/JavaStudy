package chapter9_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("AAA");
		list.add("bbb");
		list.add("CCC");
		list.add("ddd");
		list.add("EEE");
		
		//��ҹ��ڸ� �����ϴ� ����
		Collections.sort(list);
		System.out.println(list);
		
		//���ٽ��� �̿��Ͽ��� ��ҹ��ڸ� �����ϴ� �� �޼ҵ带 �ۼ��Ͽ� �����Ѵ�.
		Collections.sort(list, (a,b) -> a.compareToIgnoreCase(b));
		
		System.out.println("��ҹ��ڸ� �������� ���� ����");
		System.out.println(list);
	}

}
