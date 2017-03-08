package com.tsq.dm.structure.adaptee;

public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	public void method1() {
		this.source.method1();
	}

	public void method2() {
		System.out.println("this is a targetable(可命中目标的) method!");
	}

}
