package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.bean.Report;

public class DBQueryOperation {

	public static List<Report> getReport(String buildModule, String buildDate) throws Exception {
		List<Report> list = new ArrayList<Report>();

		try {

			Connection con = DBConnection.getConnection();
			
			System.out.println("123459:"+con);
			
			PreparedStatement ps = con.prepareStatement("select * from JENKINS_BUILD_DETAILS where fullName like '%"+buildModule+"%'"
					+ "and endDate like '%"+buildDate+"%'");
			ResultSet rs = ps.executeQuery();
			System.out.println("123459:"+rs);
			while (rs.next()) {
				Report u = new Report();
				System.out.println("123459:"+rs.getString("name"));
				u.setSid(rs.getString("name"));
				u.setBuild_module(rs.getString("fullName"));
				u.setBuild_status(rs.getString("result"));
				list.add(u);
			}
			
			con.close();
		} catch (Exception e) {
			throw e;
		}
		return list;
	}
	
}
