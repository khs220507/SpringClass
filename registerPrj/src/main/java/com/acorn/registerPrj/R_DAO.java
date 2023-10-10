package com.acorn.registerPrj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class R_DAO {
	@Autowired
	DataSource ds;
	
	
	public R_Member insertOne(R_Member member) throws SQLException {
		
		String sql = "insert into test_member_tbl(id,name,pw,phone,email) values(?,?,?,?,?)";
		Connection con = ds.getConnection();
		PreparedStatement pst = null;
			try {
				
				pst = con.prepareStatement(sql);
				pst.setString(1, member.getId());
				pst.setString(2, member.getName());
				pst.setString(3, member.getPw());
				pst.setString(4, member.getPhone());
				pst.setString(5, member.getEmail());
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			con.close();
			pst.close();
			
			
			return member; 
	}
	
	public void deleteOne(String id) throws SQLException {
		Connection con = ds.getConnection();
		String sql = "delete from test_member_tbl where id=?";
		PreparedStatement pst = null ;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pst.close();
		con.close();

	}
	
	public void updateMember(R_Member member) throws SQLException {
		Connection con = ds.getConnection();
		String sql = "update test_member_tbl set pw =? where id=?";
		PreparedStatement pst = null ;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, member.getPw());
			pst.setString(2, member.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		con.close();
		pst.close();
		
	}
}
