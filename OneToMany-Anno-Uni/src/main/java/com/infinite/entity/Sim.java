package com.infinite.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="SIM")
public class Sim {
	
	@Id
	@Column(name="sim_id")
	@SequenceGenerator(name = "sim",initialValue = 1,allocationSize = 1,sequenceName = "sim_id")
	@GeneratedValue(generator = "sim",strategy = GenerationType.SEQUENCE)
	private Long simId;
	@Column(length = 20)
	private String companyName;
	@Column(length = 20)
	private Date expiryDate;
}
