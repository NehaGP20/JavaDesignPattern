package com.practice.patterns.builder;

import com.practice.patterns.builder.HttpClient.HttpClientBuilder;

public class Tester {

	public static void main(String[] args) {

		HttpClient client = new HttpClient.HttpClientBuilder()
				.method("GET")
				.url("google")
				.body("{}")
				.secure("admin", "neha")
				.build();
		
		System.out.println(client);
	}

}
