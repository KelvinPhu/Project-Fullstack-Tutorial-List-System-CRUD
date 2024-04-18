package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tutorial_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorialList {

	@Id
	private String id;
	private String title;
	private String description;
	private boolean published;
	
	public TutorialList(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	}
	
	
}
