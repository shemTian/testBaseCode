package com.tsq.dm.create.factory;

public class StudentsWorkFactory implements IWorkFactory{

	public Work getWork() {
		return new StudentsWork();
	}

}
