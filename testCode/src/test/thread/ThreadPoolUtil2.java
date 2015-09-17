package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池工具类 默认最多4个线程同时执行
 * @author tsq
 * 
 */
public class ThreadPoolUtil2 {
	// * 只创建一个 线程池
	private static final ExecutorService pool = Executors.newFixedThreadPool(4);

	/**
	 * 线程池中添加新的线程
	 * 
	 * @param commands
	 *            线程数组
	 * @author tsq
	 */
	public static void execute(Runnable[] commands) {
		for (Runnable command : commands) {
			pool.execute(command);
		}
	}

	/**
	 * 线程池中添加新的线程
	 * 
	 * @param command
	 *            单个线程
	 * @author tsq
	 */
	public static void execute(Runnable command) {
		pool.execute(command);
	}
	
	/**
	 * 关闭线程池，关闭前会把消息队列的线程执行完
	 * 
	 * @author tsq
	 */
	public static void shutDown() {
		if (!pool.isShutdown())
			pool.shutdown();
	}

}
