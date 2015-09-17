package myThread;

public class StratAndRunTest extends Thread{
	private String name;
	public StratAndRunTest(String threadName){
		this.name=threadName;
	}
	public void run(){
		for(int i=0;i<15;i++){
			System.out.println(this.name+"->>>>>在运行.....");
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StratAndRunTest thread1 = new StratAndRunTest("线程1");
		StratAndRunTest thread2 = new StratAndRunTest("线程2");
		StratAndRunTest thread3 = new StratAndRunTest("线程3");
//		thread1.run();
//		thread2.run();
//		thread3.run();
		thread1.start();
		thread2.start();
		thread3.start();
		"".toString();

	}

}
