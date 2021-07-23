package com.example;

import com.example.classloader.ClassA;

public class MyMain {
	static {
		System.out.println("static- MyMain 완료");
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.createB();

		ClassA a2 = new ClassA();
		a2.createB();

	}
}