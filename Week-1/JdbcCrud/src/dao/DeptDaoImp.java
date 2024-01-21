package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DeptDaoImp implements IDeptDao {

	Connection conn = null;
	int count = 0;
	public DeptDaoImp() {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public int insertDept(Department dept) {

		
		  String insert = "insert into dept values(?,?,?)";
		 // int count = 0;
		  try { 
		  PreparedStatement ps = conn.prepareStatement(insert); 
		  ps.setInt(1, dept.getDno());
		  ps.setString(2,dept.getDanme());
		  ps.setString(3,dept.getLocation());
		  
		   count = ps.executeUpdate();
		  
		  System.out.println(count + " records inserted successfully");
		  
		  } catch (SQLException e) {
		  
		  e.printStackTrace(); }
		 
		return 0;
	}

	@Override
	public int updateDept(Department dept) {
		
		String update = "update Dept set dname = ?, location = ? where dno = ? ";
		
		try {
			PreparedStatement ps = conn.prepareStatement(update);
			ps.setString(1,dept.getDanme());
			ps.setString(2, dept.getLocation());
			ps.setInt(3,dept.getDno());
			
			count = ps.executeUpdate();
			System.out.println(count+" records updated successfully");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int deleteOneDept(int dno) {
		
		String delete = "delete from dept where dno =?";
		try {
			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setInt(1,dno);
			count  =ps.executeUpdate();
			System.out.println(count +" record deleted successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Department selectOneDept(int dno) {
		
		String selectOne = "select dno, dname,location from dept where dno =?";
		
		try {
			PreparedStatement ps  =conn.prepareStatement(selectOne);
			ps.setInt(1, dno);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("dno")+" "+ rs.getString("dname")+" "+rs.getString("location"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Department> selectAllDept() {

		String selectAll = "select dno, dname, location from dept";
		
		List<Department> list = new ArrayList<Department>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(selectAll);
			
			ResultSet rs  = ps.executeQuery();
			while(rs.next())
			{
				Department dept = new Department(rs.getInt("dno"), rs.getString("dname"), rs.getString("location"));
				list.add(dept);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}

}
