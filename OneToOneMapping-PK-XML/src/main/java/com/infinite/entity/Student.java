package com.infinite.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student{
	
	private BigDecimal studentId;
	private String addr;
	private String name;
	private Integer age;
	private Library library;
	
	@Override
	public String toString() {
		return "Person [personId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
