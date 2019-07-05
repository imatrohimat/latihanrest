package com.eksad.latihanrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper= true)
public class Customer extends Person {
 
	@Column(name = "card_num")
	private String cardNum;
}
