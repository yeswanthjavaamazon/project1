package thread;

public class DeadLock {
	final String s1 = "Java";
	final String s2 = "Program";

	Thread t1 = new Thread("Thread 1") {
		public void run() {
			while (true) {
				synchronized (s1) {
					System.out.println("Thread1 got s1");
					synchronized (s2) {
						System.out.println("Thread1 gor s2");
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread("Thread 2") {
		public void run() {
			while (true) {
				synchronized (s2) {
					System.out.println("Thread2 got s2");
					synchronized (s1) {
						System.out.println("Thread2 got s1");
						System.out.println(s2 + s1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadLock d1 = new DeadLock();
		d1.t1.start();
		d1.t2.start();
	}
}