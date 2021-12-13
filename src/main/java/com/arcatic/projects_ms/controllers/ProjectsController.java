package com.arcatic.projects_ms.controllers;

import com.arcatic.projects_ms.exceptions.ProjectNotFoundException;
import com.arcatic.projects_ms.models.Projects;
import com.arcatic.projects_ms.repositories.ProjectsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectsController {
    private final ProjectsRepository projectsRepository;

    public ProjectsController(ProjectsRepository projectsRepository){
        this.projectsRepository = projectsRepository;
    }

    @GetMapping("/projects/{projectname}")
    Projects getProject(@PathVariable String projectname){
        return projectsRepository.findById(projectname)
                .orElseThrow( () -> new ProjectNotFoundException("No se encontró un proyecto con el projectname:" + projectname));
    }

    @PostMapping("/projects")
    Projects newProject(@RequestBody Projects project){
        return projectsRepository.save(project);
    }
}

