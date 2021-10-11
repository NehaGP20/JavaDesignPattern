package com.practice.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {

		//First create variable for factory of factories
		DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
		
		//Using one factory create create instance of dao
		Dao dao = daf.createDao("emp");
		dao.save();
	}

}
