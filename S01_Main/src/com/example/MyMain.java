package com.example;

public class MyMain {
	static {
		System.out.println("static- MyMain 완료");
	}

	public static void greet(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		greet("Hello MyMain");
	}
}