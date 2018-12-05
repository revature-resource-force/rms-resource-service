package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.revature.models.Resource;
import com.revature.repository.ResourceRepository;

@Service
public class ResourceService {
	
	ResourceRepository resourceRepo;

	@Autowired
	public ResourceService(ResourceRepository resourceRepo) {
		super();
		this.resourceRepo = resourceRepo;
	}

	public List<Resource> getAllResources(Pageable pageable) {
		List<Resource> allResources = (List<Resource>) resourceRepo.findAll(pageable);
		allResources.removeIf(r -> r.isDisabled() == true);	
		return allResources;
	}
	
	

	//tested
	public Resource getResourceById(int id) {
		return resourceRepo.getResourceById(id);
	} 
	
	//tested
	public List<Resource> getResourcesById(int[] ids) {
		return resourceRepo.getResourcesById(ids);
	}
	
	//tested
	public Resource save(Resource resource) {
		return resourceRepo.save(resource);
	}
}
