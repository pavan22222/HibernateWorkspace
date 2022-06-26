package com.infinite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person{
	
	private Long personId;
	private String addr;
	private String name;
	private Integer age;
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
