package com.tsq.dm.structure.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Source source = new Source();
		Proxy proxy = new Proxy(source);
		proxy.method();
	}
}
