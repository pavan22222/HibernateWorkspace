package com.infinite.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity()
@Table(name="MOBILE")
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	
	@Id
	@SequenceGenerator(name = "mob",initialValue = 1,allocationSize = 1,sequenceName = "MOBILE_ID")
	@GeneratedValue(generator = "mob",strategy = GenerationType.SEQUENCE)
	@Column(name="mobile_id")
	private Long mobileId;
	@Column(name="companyName",length = 20)
	private String companyName;
	@Column(name="price",length = 20)
	@Type(type = "float")
	private Float price;
	

}
