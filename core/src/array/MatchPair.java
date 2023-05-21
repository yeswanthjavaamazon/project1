package array;

public class MatchPair {
	public static void main(String[] args) {
		int[] intputArray = { 1, 3, 4, 6, 7 };
		int k = 7;
		for (int i = 0; i < intputArray.length; i++) {
			for (int j = i + 1; j < intputArray.length; j++) {
				if (intputArray[i] + intputArray[j] == k) {
					System.out.println(intputArray[i] + ", " + intputArray[j]);
				}
			}
		}
	}
}

//int[] intputArray = {1,3,4,6,7};
//int k = 7;
//}	
//public int[] twoSum(int[] inputArray, int k){
//	Map<Integer, Integer> map = new HashMap<>;
//	for(int i = 0;i<inputArray.length;i++){
//		int temp = k-inputArray[i];
//		if(map.containsKey(temp)){
//		return new int[] {map.get(temp)};
//	}
//	map.put(inputArray[i], i);
//	}
//}