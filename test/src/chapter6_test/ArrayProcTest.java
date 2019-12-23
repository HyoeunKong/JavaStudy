package chapter6_test;

public class ArrayProcTest {

	public static void main(String[] args) {
		int [] list = {1,2,3,4,5};
		ArrayProc obj = new ArrayProc();
		obj.inc(list);
		
		for(int e:list) {
			System.out.print(e+" ");
		}

	}

}
