package com.cd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DOCTOR_INFO")
@Data
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="DOC_NAME")
	private String docName;
	@Column(name="SPECIALIZATION")
	private String Specialization;
	@Column(name="DOC_INCOME")
	private Double income;
	@Column(name="PLACE")
	private String place;
	
}
