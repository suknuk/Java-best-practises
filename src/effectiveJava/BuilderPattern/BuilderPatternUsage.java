package effectiveJava.BuilderPattern;

public class BuilderPatternUsage {

	public static void main(String[] args) {
		
		BuilderPattern test1 = new BuilderPattern.Builder(10, 20).build();
		BuilderPattern test2 = new BuilderPattern.Builder(10, 20).param4(40).build();
		BuilderPattern test3 = new BuilderPattern.Builder(10, 20).param3(30).param4(40).build();
		
		
		System.out.println(test1.getParam1());
		System.out.println(test2.getParam3());
		System.out.println(test3.getParam4());
	}

}
