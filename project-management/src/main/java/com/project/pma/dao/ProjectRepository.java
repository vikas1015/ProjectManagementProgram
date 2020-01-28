package com.project.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.pma.entities.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long>
{
	@Override
	public List<Project> findAll();
}
