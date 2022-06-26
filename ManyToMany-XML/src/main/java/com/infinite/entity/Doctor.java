package com.infinite.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Doctor {
	
	private Integer doctorId;
	private String name;
	private List<Patient> patients;

}
