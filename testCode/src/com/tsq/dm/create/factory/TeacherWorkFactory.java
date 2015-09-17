package com.tsq.dm.create.factory;

public class TeacherWorkFactory implements IWorkFactory {

	public Work getWork() {
		return new TeacherWork();
	}

}
