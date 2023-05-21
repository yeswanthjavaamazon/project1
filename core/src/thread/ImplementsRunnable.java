package thread;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ImplementsRunnable {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		for (int i = 10; i <= 20; i++) {
			System.out.println("Main Thread");
		}
	}
}
