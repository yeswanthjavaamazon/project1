package number_programs;

public class Print10 {
	public static void main(String[] args) {
		printr(1);
	}
	public static void printr(int numbers){
		if(numbers<=10){
			System.out.println(numbers);
			printr(numbers+1);
		}
	}
}
