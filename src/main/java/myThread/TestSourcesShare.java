package myThread;

public class TestSourcesShare implements Runnable {
	private long tickets=10l;
	public void run() {
		for(int i=0;i<500;i++){
			System.out.println(this.getClass().toString()+"剩余票数"+tickets--);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestSourcesShare mt = new TestSourcesShare();
		boolean is = TestSourcesShare.class.isAssignableFrom(Runnable.class);
		//创建3个线程共享资源tickets
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}

}
