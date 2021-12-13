package com.arcatic.projects_ms.models;
import org.springframework.data.annotation.Id;

public class Projects {
    @Id
    private String projectname;
    private  String description;
    private  String url_repositories;
    private String developerteam;
    private String teammembers;
    private String devlangused;
    private String frameworksused;
    private  String url_project;
    private  String category;
    private  String url_videodemo;
    private  String university;
    private  String cycle;
    private  String year;
    private String demoinstructions;
    private String potentialities;
    private String limitations;

    public Projects(String projectname, String description, String url_repositories, String developerteam, String teammembers, String devlangused, String frameworksused, String url_project, String category, String url_videodemo, String university, String cycle, String year, String demoinstructions, String potentialities, String limitations) {
        this.projectname = projectname;
        this.description = description;
        this.url_repositories = url_repositories;
        this.developerteam = developerteam;
        this.teammembers = teammembers;
        this.devlangused = devlangused;
        this.frameworksused = frameworksused;
        this.url_project = url_project;
        this.category = category;
        this.url_videodemo = url_videodemo;
        this.university = university;
        this.cycle = cycle;
        this.year = year;
        this.demoinstructions = demoinstructions;
        this.potentialities = potentialities;
        this.limitations = limitations;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl_repositories() {
        return url_repositories;
    }

    public void setUrl_repositories(String url_repositories) {
        this.url_repositories = url_repositories;
    }

    public String getDeveloperteam() {
        return developerteam;
    }

    public void setDeveloperteam(String developerteam) {
        this.developerteam = developerteam;
    }

    public String getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(String teammembers) {
        this.teammembers = teammembers;
    }

    public String getDevlangused() {
        return devlangused;
    }

    public void setDevlangused(String devlangused) {
        this.devlangused = devlangused;
    }

    public String getFrameworksused() {
        return frameworksused;
    }

    public void setFrameworksused(String frameworksused) {
        this.frameworksused = frameworksused;
    }

    public String getUrl_project() {
        return url_project;
    }

    public void setUrl_project(String url_project) {
        this.url_project = url_project;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl_videodemo() {
        return url_videodemo;
    }

    public void setUrl_videodemo(String url_videodemo) {
        this.url_videodemo = url_videodemo;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDemoinstructions() {
        return demoinstructions;
    }

    public void setDemoinstructions(String demoinstructions) {
        this.demoinstructions = demoinstructions;
    }

    public String getPotentialities() {
        return potentialities;
    }

    public void setPotentialities(String potentialities) {
        this.potentialities = potentialities;
    }

    public String getLimitations() {
        return limitations;
    }

    public void setLimitations(String limitations) {
        this.limitations = limitations;
    }
}
