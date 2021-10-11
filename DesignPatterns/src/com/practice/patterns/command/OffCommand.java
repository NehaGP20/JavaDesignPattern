package com.practice.patterns.command;

public class OffCommand implements Command {

	private Television television;
	
	public Television getTelevision() {
		return television;
	}


	public void setTelevision(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.off();

	}

}
