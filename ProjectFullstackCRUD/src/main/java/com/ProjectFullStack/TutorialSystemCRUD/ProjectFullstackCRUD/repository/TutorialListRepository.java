package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.model.TutorialList;

@Repository
public interface TutorialListRepository extends JpaRepository<TutorialList, String>{
	List<TutorialList> findByPublished(boolean published);

	List<TutorialList> findByTitleContaining(String title);
}
