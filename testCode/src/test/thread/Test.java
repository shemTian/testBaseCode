package test.thread;

public class Test {

	public static void main(String[] args) {
		//ThreadPoolUtil util2 = ThreadPoolUtil.getInstance();
		System.out.println("1----"+ThreadPoolUtil2.getS().hashCode());
		Runnable[] rs = new Runnable[3];
		rs[0] = new TestThreadPool("T1");
		rs[1] = new TestThreadPool("T2");
		rs[2] = new TestThreadPool("T3");
		ThreadPoolUtil2.execute(rs);
		Runnable t = new Runnable(){
			public void run() {
				System.out.println("2----"+ThreadPoolUtil2.getS().hashCode());
			}};
		Thread tr = new Thread(t);
		tr.start();
	}

}
