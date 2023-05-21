package others;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{
	
	public static Singleton instance;
	
	private Singleton(){
		if(Singleton.instance!=null){
			throw new InstantiationError("Colud not able to create object");
		}
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve(){
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return instance;
	}

	public static void main(String[] args) {
		
	}
}