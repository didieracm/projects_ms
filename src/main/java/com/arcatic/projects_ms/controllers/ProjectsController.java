package com.arcatic.projects_ms.controllers;

import com.arcatic.projects_ms.exceptions.ProjectNotFoundException;
import com.arcatic.projects_ms.models.Projects;
import com.arcatic.projects_ms.repositories.ProjectsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectsController {
    private final ProjectsRepository projectsRepository;

    public ProjectsController(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }


    @PostMapping("/projects")
    Projects newProject(@RequestBody Projects project) {
        return projectsRepository.save(project);
    }

    @GetMapping("/feed")
    List<Projects> projectsFeed() {
        List<Projects> projecstFeed = projectsRepository.findAll();
        return projecstFeed;
    }

    @GetMapping("/projects/{projectname}")
    Projects getProject(@PathVariable String projectname) {
        return projectsRepository.findById(projectname)
                .orElseThrow(() -> new ProjectNotFoundException("No se encontró un proyecto con el nombre: " + projectname + "."));
    }

    @PutMapping("/projects/{projectname}/update")
    Projects putProject(@PathVariable String projectname, @RequestBody Projects projectInfo) {
        Projects upToDateProject = projectsRepository.findById(projectname).orElse(null);
        if (upToDateProject == null)
            throw new ProjectNotFoundException("No se encontró un proyecto con el nombre: " + projectname + ".");
        return projectsRepository.save(projectInfo);
    }

    @DeleteMapping("/projects/{projectname}/delete")
    String delProject(@PathVariable String projectname) {
        Projects byeProject = projectsRepository.findById(projectname).orElse(null);
        if (byeProject == null)
            throw new ProjectNotFoundException("No se encontró un proyecto con el nombre: " + projectname);
        projectsRepository.delete(byeProject);
        return byeProject.getProjectname() + " eliminado exitosamente.";
    }
}
