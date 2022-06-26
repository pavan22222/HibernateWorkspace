package com.infinite.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
	
	private BigDecimal passportId;
	private String country;
	private Date expiryDate;
	private Person personDetails;
	
	
}
