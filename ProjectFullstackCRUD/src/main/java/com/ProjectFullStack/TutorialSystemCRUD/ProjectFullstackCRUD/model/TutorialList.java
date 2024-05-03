package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tutorial_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorialList {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private boolean published;
	
	public TutorialList(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	}
	
	
}
