package com.eksad.latihanrest.DAO;

import org.springframework.data.repository.CrudRepository;

import com.eksad.latihanrest.model.Person;

public interface PersonDao extends CrudRepository<Person,Long> {

}
