package com.section7;
public class HigherOrderFunction {
	public static void main(String[] args) {
		
		IFactory<Integer> factory = createFactory(() -> Math.random()*100, r -> r.intValue());
		Integer product1 = factory.create();
		System.out.println(product1);
	}
	
	public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator){		
		return () -> {
			T product=producer.produce();
			return configurator.configure(product);
			
		};
	}
}
