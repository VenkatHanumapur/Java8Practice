package com.section7;

@FunctionalInterface
public interface Function<I,D> {	
	D apply(I i);
	default <S> Function<S,D> compose(Function<S, I> before) {	     
		return (S s) -> {
			I i = before.apply(s);
			return  apply(i);			
			//return 	apply(before.apply(s));
			};		
	}
}
