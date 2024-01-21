package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {
		
		Connection conn = DBUtil.getDBConnection();
		
		/*
		 * String insert = "insert into dept values(?,?,?)";
		 * 
		 * try { PreparedStatement ps = conn.prepareStatement(insert); ps.setInt(1, 90);
		 * ps.setString(2,"Logistics"); ps.setString(3,"Noida");
		 * 
		 * int count = ps.executeUpdate();
		 * 
		 * System.out.println(count +"records effected");
		 * 
		 * } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */
	//	String update = "update dept set dname = ?, location = ? where dno = ?";
		
		/*
		 * try { PreparedStatement ps = conn.prepareStatement(update); ps.setString(1,
		 * "HotelManagement"); ps.setString(2,"Greater Noida"); ps.setInt(3,90);
		 * 
		 * int count = ps.executeUpdate();
		 * 
		 * System.out.println(count +"records updated");
		 * 
		 * } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		//String selectId = "select dno,dname,location from dept where dno > ?";
		/*
		 * String selectAll = "select dno,dname,location from dept";
		 * 
		 * try { PreparedStatement ps = conn.prepareStatement(selectAll); //ps.setInt(1,
		 * 50);
		 * 
		 * ResultSet rs = ps.executeQuery(); while(rs.next()) {
		 * System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); }
		 * 
		 * 
		 * 
		 * 
		 * } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		String delete = "delete from dept where dno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setInt(1, 90);
			
			int count = ps.executeUpdate();
			System.out.println(count +"rows deleted successfully");
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
