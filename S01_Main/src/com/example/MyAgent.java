package com.example;

import java.lang.instrument.Instrumentation;

public class MyAgent {
	static {
		System.out.println("static- MyAgent 완료");
	}

	public static void premain(String agentArgs, Instrumentation inst) {
		System.out.println("MyAgent: premain1");
		System.out.println("MyAgent: inst.getObjectSize: " + inst.getObjectSize(new MyMain()));
	}
}