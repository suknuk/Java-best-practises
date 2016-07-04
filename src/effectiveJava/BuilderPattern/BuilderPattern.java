package effectiveJava.BuilderPattern;

public class BuilderPattern {
	private final int param1;
	private final int param2;
	private final int param3;
	private final int param4;

	static class Builder {
		// required parameters
		private final int param1;
		private final int param2;

		// Optional parameters - initialized to default values
		private int param3 = 0;
		private int param4 = 0;

		public Builder(int param1, int param2) {
			this.param1 = param1;
			this.param2 = param2;
		}

		public Builder param3(int val) {
			param3 = val;
			return this;
		}

		public Builder param4(int val) {
			param4 = val;
			return this;
		}

		public BuilderPattern build() {
			return new BuilderPattern(this);
		}

	}

	private BuilderPattern(Builder builder) {
		param1 = builder.param1;
		param2 = builder.param2;
		param3 = builder.param3;
		param4 = builder.param4;
	}
	
	public int getParam1(){
		return this.param1;
	}
	public int getParam2(){
		return this.param2;
	}
	public int getParam3(){
		return this.param3;
	}
	public int getParam4(){
		return this.param4;
	}

}
