package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 线程池单例模式
 * @author tsq
 */
public class ThreadPoolUtil {
	private int DEFAULT_FIX_POOL_SIZE = 4;
	private ExecutorService pool;
	private ThreadPoolUtil(){
		pool = Executors.newFixedThreadPool(DEFAULT_FIX_POOL_SIZE);
	}
	//使用静态内部类初始化防止多线程下生成多个线程池
	private static class PoolGenerator{
		private static ThreadPoolUtil poolUtil = new ThreadPoolUtil();
	}
	public static ThreadPoolUtil getInstance(){
		return PoolGenerator.poolUtil;
	}
	
	/**
	 * 线程池控制并发线程数量
	 * @param commands
	 * @author tsq
	 */
	public void execute(Runnable[] commands){
		for(Runnable command:commands){
			pool.execute(command);
		}
		pool.shutdown();
		
	}
	
	public ExecutorService getS(){
		return pool;
	}
}
