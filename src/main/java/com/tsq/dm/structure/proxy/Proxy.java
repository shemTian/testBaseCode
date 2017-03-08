package com.tsq.dm.structure.proxy;

public class Proxy implements Sourcealbe {
	private Source source;
	public Proxy(Source source){
		super();
		this.source = source;
	}
	public void method() {
		before();
		source.method();
		after();
	}
	private void after() {
		System.out.println("after method excute!");
	}
	private void before() {
		System.out.println("before method excute!");
	}
	
}
