package com.example;

import java.io.File;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType.Builder;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

public class MyMagicianMain {
	public static void main(String[] args) {
		try {
			Builder<Hat> redefine = new ByteBuddy().redefine(Hat.class);
			redefine.method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit"))
			.make().saveIn(new File("F:\\workspace2020\\javaagent-test\\S03_ByteBuddyTest\\bin"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 현재 라인에서는 변경된 Hat 클래스로 반영되지 않는다. 이미 변경하기 전에 클래스 로더에 올라갔기 때문에?
		System.out.println("B: " + new Hat().pullOut());
	}
}
