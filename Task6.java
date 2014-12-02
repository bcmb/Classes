package practice.one;

public class Task6 {

	public static void main(String[] args) {
		
		int i = 0; 
		int sum = 0;
		
		for (; i <= 20; i++) {
						
			if ((i%2) == 0) {
		
				sum += i;
									
			}
		}
		System.out.println(sum);
	}
	
}
