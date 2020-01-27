package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

public class LoginServiceImpl implements LoginService {

	private PreparedStatement pStmt;
	String sql;

	@Override
	public Emp getEmpno(int empNo, String eName) {

		sql = " select empno, ename, job, mgr from emp where empno = ? and lower(ename) = ?";

		ResultSet rs = null;
		Emp tempEmp = null;

		try {
			pStmt = DBConnection.dbCon.getPreparedStatement(sql);
			pStmt.setInt(1, empNo);
			pStmt.setString(2, eName.toLowerCase());
			rs = pStmt.executeQuery();

			if (rs.next()) {
				tempEmp = new Emp();
				tempEmp.setEmpNo(rs.getInt(1));
				tempEmp.seteName(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
				return tempEmp;
			}

		} catch (SQLException e) {
			// SQLException�� �߻��� �� �����Ƿ�, Exception���� �ѹ��� catch ���� ���� ����ȭ�ϱ�
			System.err.println("LoginServiceImpl - getEmpno() => " + e.getMessage());
		} catch (Exception e) {
			System.out.println("LoginServiceImpl - getEmpno() => " + e.getMessage());
		}

		return null;

	}

}