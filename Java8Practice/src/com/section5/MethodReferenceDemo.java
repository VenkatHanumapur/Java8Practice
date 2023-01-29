package com.section5;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
	
	public void test11() {
		
	}

	public static void main(String[] args) {
		
		MyTest mt = new MyTest("Test111");
		
		Consumer<MyTest> cons1 = MyTest::testValue;
		cons1.accept(mt);
		
		
		
		
		
		
		
		Supplier<String> sup1 = MyTest::getTestValue;
		System.out.println(sup1.get());

	}

}
