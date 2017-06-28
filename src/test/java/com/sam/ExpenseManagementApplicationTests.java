package com.sam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sam.model.Project;
import com.sam.service.ProjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExpenseManagementApplicationTests {

	@Autowired
	private ProjectService projectService;

	@Test
	public void contextLoads() {
		Project project = new Project();
		project.setName("Holiday");
		project.setDescription("Sample Desc");

		Project project2 = projectService.createProject(project);
		System.out.println(project2);
	}

}
