package com.practice.patterns.command;

public class Person {

	public static void main(String[] args) {

		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl();
		
		OnCommand onCommand = new OnCommand();
		//We are passing in television type instance 
		onCommand.setTelevision(television);
		
		//We are passing in command type instance
		remoteControl.setCommand(onCommand);
		remoteControl.pressButton();
		
		OffCommand offCommand = new OffCommand();
		//We are passing in television type instance 
		offCommand.setTelevision(television);
		
		//We are passing in command type instance
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();
		
	}

}
