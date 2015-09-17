package com.tsq.dm.structure.adaptee;

public class AdatperTest {

	public static void main(String[] args) {
		
		//类的适配器模式
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		
		//对象的适配器模式
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}

}
