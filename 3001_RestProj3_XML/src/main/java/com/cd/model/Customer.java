package com.cd.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 
	//Simple Properties
	private Integer cno;
	private String cname;
	private Float billAmt;
	
	//Complex Array Properties
	private String[] favColors;
	//Complex Collection Properties
	private List<String> studies;
	private Set<Long> phoneNumbers;
	private Map<String,Object> idDetails;
	
	//Has-A property, Composition
	
	private Company company;
	
	
}
