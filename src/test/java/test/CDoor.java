package test;

public class CDoor extends Door{

	@Override
	protected void doOpen() {
		super.close();		
	}

}
