package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = s;
		this.s = funkifyText();
	}
	
	public String toString() {
		return s;
	}

	public String funkifyText() {
		// TODO Auto-generated method stub
		return null;
	}
}
