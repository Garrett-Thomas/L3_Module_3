package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		s = "tHiS Is aLsO A TeSt";
		StringBuilder something = new StringBuilder(s);
		return something.toString();
	}


}
