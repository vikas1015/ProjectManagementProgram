package com.project.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.pma.dao.EmployeeRepository;
import com.project.pma.dao.ProjectRepository;
import com.project.pma.entities.Employee;
import com.project.pma.entities.Project;

import java.util.List;

@Controller
public class HomeController 
{
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model)
	{
		//we are querying the database for projects
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList", projects);
		
		
		//we are querying the database for employees
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employeesList", employees);
		
		return "main/home";
		
	}

}
