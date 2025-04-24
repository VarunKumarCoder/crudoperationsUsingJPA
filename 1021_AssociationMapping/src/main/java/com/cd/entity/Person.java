package com.cd.entity;

import java.io.Serializable;
import java.util.Set;

import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PERSON_INFO")
@Setter
@Getter
@RequiredArgsConstructor
//@NoArgsConstructor
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@Column(length = 50)
	@NonNull
	private String pname;
	@Column(length = 60)
	private String paddrs;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "personInfo")
	private Set<PhoneNumber> contactDetails;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", contactDetails=" + contactDetails
				+ "]";
	}

	public Person(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	
	
}
