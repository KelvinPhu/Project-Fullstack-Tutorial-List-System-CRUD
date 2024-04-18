package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model.TutorialList;
import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.service.TutorialListService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:8081")
public class TutorialListController {

	@Autowired
	private TutorialListService tutorialListService;
	
	@GetMapping("/tutorials")
	@ResponseStatus(HttpStatus.OK)
	public Flux<TutorialList> getAllTutorials(@RequestParam(required = false) String title) {
		if (title == null)
			return tutorialListService.findAll();
	    else
	    	return tutorialListService.findByTitleContaining(title);
	}

	@GetMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mono<TutorialList> getTutorialById(@PathVariable("id") String id) {
	    return tutorialListService.findById(id);
	}
	
	@PostMapping("/tutorials")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<TutorialList> createTutorial(@RequestBody TutorialList tutorialList) {
	    return tutorialListService.save(new TutorialList(tutorialList.getTitle(), tutorialList.getDescription(), false));
	}
	
	@PutMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mono<TutorialList> updateTutorial(@PathVariable("id") String id, @RequestBody TutorialList tutorial) {
	    return tutorialListService.update(id, tutorial);
	}
	
	@DeleteMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteTutorial(@PathVariable("id") String id) {
	    return tutorialListService.deleteById(id);
	}

	@DeleteMapping("/tutorials")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteAllTutorials() {
	    return tutorialListService.deleteAll();
	}
	
	@GetMapping("/tutorials/published")
	@ResponseStatus(HttpStatus.OK)
	public Flux<TutorialList> findByPublished() {
	    return tutorialListService.findByPublished(true);
	}
}
