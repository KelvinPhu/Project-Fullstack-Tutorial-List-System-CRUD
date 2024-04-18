package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model.TutorialList;
import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.repository.TutorialListRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TutorialListService {
	
	@Autowired
	private TutorialListRepository tutorialListRepo;
	
	public Flux<TutorialList> findAll() {
	    return tutorialListRepo.findAll();
	  }

	public Flux<TutorialList> findByTitleContaining(String title) {
	    return tutorialListRepo.findByTitleContaining(title);
	}

	public Mono<TutorialList> findById(String id) {
	    return tutorialListRepo.findById(id);
	}
	
	public Mono<TutorialList> save (TutorialList tutorialList){
		return tutorialListRepo.save(tutorialList);
	}
	
	public Mono<TutorialList> update(String id, TutorialList tutorialList) {
	    return tutorialListRepo.findById(id).map(Optional::of).defaultIfEmpty(Optional.empty())
	        .flatMap(optionalTutorial -> {
	          if (optionalTutorial.isPresent()) {
	        	  tutorialList.setId(id);
	            return tutorialListRepo.save(tutorialList);
	          }

	          return Mono.empty();
	        });
	}
	
	public Mono<Void> deleteById(String id) {
	    return tutorialListRepo.deleteById(id);
	}

	  public Mono<Void> deleteAll() {
	    return tutorialListRepo.deleteAll();
	  }

	  public Flux<TutorialList> findByPublished(boolean isPublished) {
	    return tutorialListRepo.findByPublished(isPublished);
	  }
}
