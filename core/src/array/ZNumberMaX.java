package array;

public class ZNumberMaX {
	public static void findMaxNmber(int[] array) {
		int maxOne = 0;
		int maxTwo = 0;

		for (int i : array) {
			if (maxOne < i) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (maxTwo < i) {
				maxTwo = i;
			}
		}
		System.out.println("FirstMaximum Number is : "+maxOne);
		System.out.println("SecondMaximum Number is : "+maxTwo);
	}
	
	public static void main(String[] args) {
		int a[] = {4,23,67,1,76,1,98,13};
		for(int i : a){
			System.out.println(i);
		}
		findMaxNmber(a);
	}
}
