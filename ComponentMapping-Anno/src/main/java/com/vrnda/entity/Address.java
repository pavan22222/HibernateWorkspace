package com.vrnda.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
	@Column
	private String doorNo;
	@Column
	private String streetName;
	@Column
	private String city;
	@Column
	private Long pinCode;

}
