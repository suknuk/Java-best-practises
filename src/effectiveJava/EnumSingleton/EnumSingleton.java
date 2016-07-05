package effectiveJava.EnumSingleton;

public enum EnumSingleton {
	INSTANCE;
	
	private EnumSingleton(){
		System.out.println("Hello");
	}
	
	public void doSmth(){
		System.out.println("Doing something");
	}
}
