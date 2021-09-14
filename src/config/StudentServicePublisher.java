package config;

import javax.xml.ws.Endpoint;

import service.StudentServiceImpl;

public class StudentServicePublisher {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:8080/studentservice", new StudentServiceImpl());
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
