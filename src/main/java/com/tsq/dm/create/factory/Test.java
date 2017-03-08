package com.tsq.dm.create.factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IWorkFactory workFactory = new StudentsWorkFactory();
		workFactory.getWork().doWork();
		workFactory = new TeacherWorkFactory();
		workFactory.getWork().doWork();
	}

}
