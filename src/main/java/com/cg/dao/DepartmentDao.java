package com.cg.dao;

import java.util.List;

import com.cg.entity.Department;

public interface DepartmentDao {
	
	public String addDepartment(Department Department);
	
	List<Department> getAllDepartments();

}
