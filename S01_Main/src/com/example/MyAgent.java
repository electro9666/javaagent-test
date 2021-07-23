package com.example;

import java.lang.instrument.Instrumentation;

public class MyAgent {
	public static void premain(String agentArgs, Instrumentation inst) {
		System.out.println("premain1");
		System.out.println(inst.getObjectSize(new MyMain()));
	}
}