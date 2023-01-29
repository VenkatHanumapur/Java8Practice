package com.section5;

import java.util.List;
import java.util.function.Function;

public class ClassNameRefInstanceMethodTest {

	public static void main(String[] args) {
		List<Employee> empList= List.
				of(new Employee("Raj",14442),
						new Employee("Kamal",6000),
						new Employee("Kiran",7000));
		
		Function<Employee,String> name= Employee::getName;
		
		//Function<Employee, String> nameFunction = e -> e.getName();
		empList.stream().map(Employee::getName).forEach(System.out::println);;

	}

}
