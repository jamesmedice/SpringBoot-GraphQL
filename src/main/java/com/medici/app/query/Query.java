package com.medici.app.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.medici.app.model.Actor;
import com.medici.app.repository.ActorRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	ActorRepository repository;

	public Iterable<Actor> findAll() {
		return repository.findAll();
	}

	public Actor findById(int id) {
		return repository.findById(id).get();
	}

}
