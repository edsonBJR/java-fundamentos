package hackerrank;

public class MinMaxSumArray {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i = 1; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		System.out.println(sum);
		sum = 0;
		
		for(int i = 0; i < 4; i++) {
			sum = sum + array[i];							
		}
		
		System.out.println(sum);
		
	}

}
