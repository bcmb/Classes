package practice.one;

public class Task3 {
	
	public static void main(String[] args) {
		
		short short1 = 10 + 11;
		short short2 = (short) (10 + (10.08f));
		short short3 = (short) (10 + (1.008));
		byte byteVar = 5;
		float floatVar = 102.745f;
		double doubleVar = 102457.44745;
		short short4 = (short) (byteVar + 1.008f);
		short short5 = (short) (floatVar + doubleVar);
		
		System.out.println(short1);
		System.out.println(short2);
		System.out.println(short3);
		System.out.println(short4);
		System.out.println(short5);

	}

}
