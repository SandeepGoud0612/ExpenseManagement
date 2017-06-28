/**
 * This source code is property of Sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Project;

/**
 * @author Sandeep
 */
public interface ProjectService {

	Project getProjectById(String id);

	List<Project> getAllProjects();

	Project createProject(Project project);

	Project updateProject(Project project);

	void deleteProject(String id);

}
