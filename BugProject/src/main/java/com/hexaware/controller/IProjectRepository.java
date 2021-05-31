package com.hexaware.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.entity.Project;

public interface IProjectRepository extends JpaRepository<Project, Long> {

}
