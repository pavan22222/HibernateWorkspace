package com.infinite.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ListIndexBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@SequenceGenerator(name = "sid",sequenceName = "STD_ID",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "sid",strategy = GenerationType.SEQUENCE)
	private Integer sid;
	@Column(length = 20)
	private String name;
	@Column
	private Integer age;
	@ElementCollection
	@Column(name="phones")
	@CollectionTable(name = "PHONE_NUMBERS",joinColumns = @JoinColumn(name = "STD_ID",referencedColumnName =  "sid"))
	private Set<Long> phoneNumbers;
	@ElementCollection
	@Column(name="hobbie")
	@CollectionTable(name = "HOBBIES",joinColumns = @JoinColumn(name="STD_ID",referencedColumnName = "sid"))
	@ListIndexBase(value = 1)
	@OrderColumn(name="hobbie_index")
	private List<String> hobbies;
	@ElementCollection
	@Column(name="SCORE")
	@CollectionTable(name = "MARKS",joinColumns = @JoinColumn(name="STD_ID",referencedColumnName = "sid"))
	@MapKeyColumn(name = "SUBJECT")
	private Map<String,Double> marks;

}
