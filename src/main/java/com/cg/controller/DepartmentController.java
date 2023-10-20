package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Department;
import com.cg.service.DepartmentService;

@RestController
@RequestMapping("/deptapi")
public class DepartmentController {

	@Autowired
	private DepartmentService ds;
	
	@PostMapping("/add")
	public String addDepartment(@RequestBody Department Department)
	{
		return ds.addDepartment(Department);
	}
	
	@GetMapping("/")
	public List<Department> getDepartmentList()
	{
		return ds.getAllDepartments();
	}
}
