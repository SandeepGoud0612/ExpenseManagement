/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Project;
import com.sam.repository.ProjectRepository;

/**
 * @author Sandeep
 */
@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ProjectService#getProjectById(java.lang.String)
	 */
	@Override
	public Project getProjectById(String id) {
		return projectRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ProjectService#getAllProjects()
	 */
	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ProjectService#createProject(com.sam.model.Project)
	 */
	@Override
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ProjectService#updateProject(com.sam.model.Project)
	 */
	@Override
	public Project updateProject(Project project) {
		return projectRepository.save(project);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ProjectService#deleteProject(java.lang.String)
	 */
	@Override
	public void deleteProject(String id) {
		projectRepository.delete(id);
	}

}
