package com.practice.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateUtil1 = DateUtil.getInstance();

		// In serialization the objects can be returned in format of stream of bytes
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("D:\\AccoliteDigital\\Self Learning\\SingletonSerialization.ser")));
		oos.writeObject(dateUtil1);

		//DateUtil dateUtil2 = DateUtil.getInstance();
		DateUtil dateUtil2 = null;
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("D:\\AccoliteDigital\\Self Learning\\SingletonSerialization.ser")));
	    dateUtil2 = (DateUtil) ois.readObject();
	    //ReadObject method returns an object back so we are typecasting and assigning it to instance type 
	    
	    oos.close();
	    ois.close();

		System.out.println(dateUtil1 == dateUtil2);
	}

}
