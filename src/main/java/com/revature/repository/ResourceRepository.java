package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

	
	public Resource getResourceById(int id);
	
	public List<Resource> getResourcesById(int[] id);

//	public List<Resource> getAllResources(Pageable pageable);
		 
}
