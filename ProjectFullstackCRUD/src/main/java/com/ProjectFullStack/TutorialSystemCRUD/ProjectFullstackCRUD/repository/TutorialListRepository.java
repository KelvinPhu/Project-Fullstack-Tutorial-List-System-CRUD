package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model.TutorialList;

import reactor.core.publisher.Flux;

public interface TutorialListRepository extends ReactiveMongoRepository<TutorialList, String>{
	Flux<TutorialList> findByPublished(boolean published);

	Flux<TutorialList> findByTitleContaining(String title);
}
