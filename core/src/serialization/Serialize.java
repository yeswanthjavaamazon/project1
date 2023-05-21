package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int i = 10;
	int j = 20;
}

public class Serialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization Ended");
		
		System.out.println("DeSerialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("DeSerialzation Ended");
		
		System.out.println(d2.i+" "+d2.j);
	}
}
