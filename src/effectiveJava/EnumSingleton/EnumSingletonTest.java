package effectiveJava.EnumSingleton;

public class EnumSingletonTest {

	public static void main(String[] args) {
		System.out.println(EnumSingleton.INSTANCE);
		EnumSingleton.INSTANCE.doSmth();

	}

}
