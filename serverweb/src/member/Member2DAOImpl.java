package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import member.DBUtil;
import member.Member2DTO;
import member.Member2DAO;



public class Member2DAOImpl implements Member2DAO {
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		String sql = "delete from member where id = ?";
		int	result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	
	public ArrayList<Member2DTO> DeptList(){
		System.out.println("DeptListȣ�� => ������ �Ѱ��� �Ķ���� ���");
		ArrayList<Member2DTO> DeptList = new ArrayList<Member2DTO>();
		Member2DTO Dept =null;
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("while");
				Dept = new Member2DTO(rs.getString(1),rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5),rs.getString(6),rs.getInt(7));
				DeptList.add(Dept);
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.close(rs, stmt, con);
	}
	return DeptList;
	}
	
	public int insert(Member2DTO member) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into member values(?,?,?,?,?,?,?)";
		
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPass());
			stmt.setString(3, member.getName());
			stmt.setString(4, member.getAddr());
			stmt.setString(5, member.getDeptno());
			stmt.setString(6, member.getGrade());
			stmt.setInt(7, member.getPoint());
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}return result;
	}
	public Member2DTO read(String id) {
		Member2DTO read = new Member2DTO();
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from member where id = ?";
		
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery(); //select����
			//�������� �ڹٰ�ü�� ��ȯ
			//- ���ڵ尡 ���� �� : DTO�� ���ڵ带 ��ȯ�ϰ� ArrayList�� add
			//- ���ڵ尡 �� ��  : DTO�� ���ڵ� ��ȯ
			while(rs.next()) {
				read = new Member2DTO(rs.getString(1),rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5),rs.getString(6),rs.getInt(7));
				
		}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return read;
	}


	
}	
	
	
	
	
	
	









