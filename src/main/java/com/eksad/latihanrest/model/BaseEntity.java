package com.eksad.latihanrest.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public class BaseEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
}
