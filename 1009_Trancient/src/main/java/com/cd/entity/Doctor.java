package com.cd.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="DOCTOR_INFO_TRANSIENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Nonnull
	@Column(name="DOC_NAME")
	private String docName;
	@Column(name="SPECIALIZATION")
	private String Specialization;
	@Column(name="DOC_INCOME")
	private Double income;
	@Column(name="PLACE")
	@Transient
	private String place;
	
}
