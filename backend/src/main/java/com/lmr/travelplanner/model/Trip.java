package com.lmr.travelplanner.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trips")
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name= "destination")
	private String destination;
	
	@Column(name= "startdate")
	private LocalDate startDate;
	
	@Column(name = "enddate")
	private LocalDate endDate;
	
	@Column(name="description")
	private String description;

}
