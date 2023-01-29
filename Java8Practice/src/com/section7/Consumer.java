package com.section7;

import java.util.Objects;
@FunctionalInterface
public interface Consumer<T> {	
	public void accept(T t);
	default Consumer<T> thenAccept(Consumer<T> next) {		
		Objects.requireNonNull(next);
		return  (T t) -> {
			 this.accept(t);
			 next.accept(t);
		 };
		
	}
}
