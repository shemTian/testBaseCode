package test;

public abstract class Door {
	private String state= "open";
	public void open(){
		state= "start->open";
		this.doOpen();
		state= "opening";
	}
	protected abstract void doOpen();
	public void close(){
		state= "close";
	}
}
