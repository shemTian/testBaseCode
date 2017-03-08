package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool extends Thread{
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Thread t1 = new TestThreadPool("T1");
		Thread t2 = new TestThreadPool("T2");
		Thread t3 = new TestThreadPool("T3");
		Thread t4 = new TestThreadPool("T4");
		Thread t5 = new TestThreadPool("T5");
		Thread t6 = new TestThreadPool("T6");
		Thread t7 = new TestThreadPool("T7");
		Thread t8 = new TestThreadPool("T8");
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		pool.execute(t7);
		pool.execute(t8);
//		pool.shutdown();  停止所有线程池中线程，若无此行代码 线程池中已打开的线程一直等到接入新的任务
	}
	TestThreadPool(String s){
		super(s);
	}
	public void run() {
		/*try {
			Thread.sleep(300*1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName()+"....正在执行线程：" +super.getName());
	}
}
