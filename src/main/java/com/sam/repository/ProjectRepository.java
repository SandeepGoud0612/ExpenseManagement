/**
 * This source code is property of Sandeep.
 */
package com.sam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Project;

/**
 * @author Sandeep
 */
@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {

}
