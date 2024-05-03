package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model.TutorialList;
import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.repository.TutorialListRepository;

@Service
public class TutorialListService {
	
	@Autowired
	private TutorialListRepository tutorialListRepo;
	
	public List<TutorialList> findAll() {
	    return tutorialListRepo.findAll();
	  }

	public List<TutorialList> findByTitleContaining(String title) {
	    return tutorialListRepo.findByTitleContaining(title);
	}

	public Optional<TutorialList> findById(String id) {
	    return tutorialListRepo.findById(id);
	}
	
	public TutorialList save (TutorialList tutorialList){
		return tutorialListRepo.save(tutorialList);
	}
	
	public Optional<TutorialList> update(String id, TutorialList tutorialList) {
		Optional<TutorialList> optionalTutorial = tutorialListRepo.findById(id);
		if (optionalTutorial.isPresent()) {
			tutorialList.setId(id);
			return Optional.of(tutorialListRepo.save(tutorialList));
		}
		return Optional.empty();
	}
	
	public void deleteById(String id) {
		tutorialListRepo.deleteById(id);
	}
	
	public void deleteAll() {
		tutorialListRepo.deleteAll();
	}
	
	public List<TutorialList> findByPublished(boolean isPublished) {
		return tutorialListRepo.findByPublished(isPublished);
	}
}
