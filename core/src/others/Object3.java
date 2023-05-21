package others;

public class Object3{
	
	private static int count = 0;
	private static Object3 obj;
	
	private Object3(){
		System.out.println("Object3() Constructor");
		count++;
	}
	
	public static Object3 getInstance(){
		if(count<3){
			obj = new Object3();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Object3 o1 = Object3.getInstance();
		Object3 o2 = Object3.getInstance();
		Object3 o3 = Object3.getInstance();
		Object3 o4 = Object3.getInstance();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}
}