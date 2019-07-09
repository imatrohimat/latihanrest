package com.eksad.latihanrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
@Setter
@Entity
@Table(name = "brand")

public class Brand extends BaseEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
//	private long id;
//	
	@Column(nullable = false) // not null
	private String name;

	@Column(name = "product_type")
	private String productType;

}
