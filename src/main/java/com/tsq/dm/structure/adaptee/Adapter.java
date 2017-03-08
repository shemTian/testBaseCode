package com.tsq.dm.structure.adaptee;
/**
 * 类的适配器模式
 * @author tsq
 *
 */
public class Adapter extends Source implements Targetable {


	public void method2() {
		System.out.println("this is a targetable(可命中目标的) method!");
	}

}
