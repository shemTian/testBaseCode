package com.tsq.dm.create.singleton;

public class LowerEfficiency {
	
	 /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static LowerEfficiency instance = null;
	/* 私有构造方法，防止被实例化 */  
	private LowerEfficiency(){
		
	}
	/**
	 * 加入线程保护（synchronized），会影响性能，每次调用getInstatce会锁住对象
	 * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
	 * @return
	 */
	public static synchronized LowerEfficiency getInstance(){
		if(instance == null){
			instance = new LowerEfficiency();
		}
		return instance;
	}
}
