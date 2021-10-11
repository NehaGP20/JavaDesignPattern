package com.practice.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private static volatile DateUtil instance;

	// Eager Initialization -> When sure that object would be created and used in
	// the application
	// private static DateUtil instance = new DateUtil();
	// Static blocks are executed when class is loaded into memory

//	static {
//		 instance = new DateUtil();
//	}

	private DateUtil() {

	}

	public static DateUtil getInstance() {

		if (instance == null) {
			// Synchronized is a very expensive process and putting a class level lock which
			// will be invoked every time when method is executed
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();

				}
			}
		}

		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}

}
