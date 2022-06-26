package com.infinite.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
	
	private BigDecimal libraryId;
	private String name;
	private Student studentDetails;
	
	
}
