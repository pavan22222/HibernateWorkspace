package com.vrnda.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@NamedQuery(name = "GET_QUERY",query="from com.vrnda.entity.Employee where id=?")
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	@Column
	private String name; 
	@Column
	private Integer age;
	@Column
	private Float salary; 
	@Column
	private Date doj;
	@Embedded
	private Address addrs;
}
