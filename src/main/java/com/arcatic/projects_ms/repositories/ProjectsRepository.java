package com.arcatic.projects_ms.repositories;
import com.arcatic.projects_ms.models.Projects;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectsRepository extends MongoRepository <Projects, String> {
}
