/**
 * This source code is property of Sandeep.
 */
package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.model.Project;
import com.sam.service.ProjectService;

/**
 * @author Sandeep
 */
@RestController
@RequestMapping(value = "/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> getProjectById(@PathVariable String id) {
		Project project = projectService.getProjectById(id);
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Project>> getAllProjects() {
		List<Project> projects = projectService.getAllProjects();
		return new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> createProject(@RequestBody Project project) {
		Project newProject = projectService.createProject(project);
		return new ResponseEntity<Project>(newProject, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> updateProject(@PathVariable String id, @RequestBody Project project) {
		Project projectDB = projectService.getProjectById(id);
		if (!StringUtils.isEmpty(projectDB)) {
			Project projectUpdated = projectService.updateProject(projectDB);
			return new ResponseEntity<Project>(projectUpdated, HttpStatus.OK);
		}
		return new ResponseEntity<Project>(HttpStatus.NOT_MODIFIED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteProject(String id) {
		projectService.deleteProject(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
