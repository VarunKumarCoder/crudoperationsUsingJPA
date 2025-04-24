package com.cd.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PHONE_NUMBERS")
@Setter
@Getter

@RequiredArgsConstructor
public class PhoneNumber implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regNo;
	private Long mobileNo;
	private String provider;
	private String numberType;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Person.class)
	private Person personInfo;
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numberType="
				+ numberType + ", personInfo=" + personInfo + "]";
	}
	public PhoneNumber(Object object, long l, String string, String string2, Person per) {
		// TODO Auto-generated constructor stub
	}
}
