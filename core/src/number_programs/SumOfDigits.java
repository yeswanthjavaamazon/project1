package number_programs;

public class SumOfDigits {
	/*public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		
		while(n!=0){
			sum = sum+(n%10);
			n = n/10;
		}
		System.out.println(sum);
	}*/
	
	int sum;
	
	public static void main(String[] args) {
		int n = 111;
		SumOfDigits s = new SumOfDigits();
		System.out.println(s.sum(n));
	}
	
	public int sum(int n){
		if(n == 0){
			return sum;
		} else {
			sum = sum + (n%10);
			sum(n/10);
		}
		return sum;
	}
}
