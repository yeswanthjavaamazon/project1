package string;

/*Solution :

Step 1 : Check whether s1 and s2 are of same length. If they are not of same length then s2 is not rotated version of s1.

Step 2 : s3 = s1 + s1;

If s1 = �JavaJ2eeStrutsHibernate� then s3 = �JavaJ2eeStrutsHibernateJavaJ2eeStrutsHibernate�.

Step 3 : Check whether s3 contains s2 using contains() method of String class. If it contains then s2 is rotated version of s1.
*/
public class Rotation2Strings {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";

		String s2 = "StrutsHibernateJavaJ2ee";

		// Step 1

		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		} else {
			// Step 2

			String s3 = s1 + s1;

			// Step 3

			if (s3.contains(s2)) {
				System.out.println("s2 is a rotated version of s1");
			} else {
				System.out.println("s2 is not rotated version of s1");
			}
		}
	}
}
