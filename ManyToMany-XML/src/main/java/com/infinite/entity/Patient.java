package com.infinite.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@ToString
public class Patient {
	
	private Integer patientId;
	private String name;
	private Set<Doctor> doctors;
}
