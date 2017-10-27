package interfaces;

public class BackwardsString extends SpecialString {
	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder something = new StringBuilder(s);
		something.reverse();
		return something.toString();
	}

	

}
