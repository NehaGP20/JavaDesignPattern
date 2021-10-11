package com.practice.patterns.templatemethod;

public class XmlDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
