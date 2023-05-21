package others;

public class MainMethodStatic {
	static{
		System.out.println("start()");
		main(new String[0]);
		System.out.println("end()");
	}
	public static void main(String[] args) {
		System.out.println("main()");
	}
}
