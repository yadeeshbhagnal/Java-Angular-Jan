package dao;

import java.util.List;

import entity.Department;

public interface IDeptDao {
	
	public int insertDept(Department dept);
	public int updateDept(Department dept);
	public int deleteOneDept(int dno);
	public Department selectOneDept(int dno);
	public List<Department> selectAllDept();
	
}
