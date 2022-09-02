package chapter09;

public class OutterClass {
	private int outterField;
	
	public OutterClass() {
		// TODO Auto-generated constructor stub
	}
	
	class InnerClass{
		private int innerField;
		public InnerClass() {
			// TODO Auto-generated constructor stub
		}
		public int getInnerField() {
			return innerField;
		}
		public void setInnerField(int innerField) {
			this.innerField = innerField;
		}
		
	}
	
	static class StaticInnerClass{
		private int staticInnerField;
		public StaticInnerClass() {
			// TODO Auto-generated constructor stub
		}
		public int getStaticInnerField() {
			return staticInnerField;
		}
		public void setStaticInnerField(int staticInnerField) {
			this.staticInnerField = staticInnerField;
		}
		
	}
	
	public int getOutterField() {
		return outterField;
	}

	public void setOutterField(int outterField) {
		this.outterField = outterField;
	}


}
