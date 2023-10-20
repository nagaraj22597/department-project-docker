package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.DepartmentDao;
import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

public class DepartmentService implements DepartmentDao{
	
	@Autowired 
	private DepartmentRepository dr;
	
	
	public String addDepartment(Department Department) {
		
		dr.save(Department);
		return "City updated successfully";
	}
	
	public List<Department> getAllDepartments(){
		
		return dr.findAll();
	}

}
