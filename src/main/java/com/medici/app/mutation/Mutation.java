package com.medici.app.mutation;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.medici.app.model.Actor;
import com.medici.app.repository.ActorRepository;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	ActorRepository repository;

	public Actor save(Integer actor_id, String first_name, String last_name) {
		Actor actor = new Actor();
		actor.setActor_id(actor_id);
		actor.setFirst_name(first_name);
		actor.setLast_name(last_name);
		actor.setLast_update(Calendar.getInstance().getTime());
		return repository.save(actor);
	}

}
