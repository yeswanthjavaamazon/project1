package number_programs;

public class Sum_Of_Digits_Recursive {

  int sum = 0;

  public int getNumberSum(int number) {
    if (number == 0) {
      return sum;
    } else {
      sum += (number % 10);
      getNumberSum(number / 10);
    }
    return sum;
  }

  public static void main(String a[]) {
    Sum_Of_Digits_Recursive mns = new Sum_Of_Digits_Recursive();
    System.out.println("Sum is: " + mns.getNumberSum(223));
  }
}
