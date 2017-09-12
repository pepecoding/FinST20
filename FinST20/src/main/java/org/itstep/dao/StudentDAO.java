package org.itstep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.itstep.dao.pojo.Student;

public class StudentDAO {

	public void createStudent(Student student) {

		Connection connection = null;
		PreparedStatement statement = null;

		String query = "INSERT INTO STUDENTS(LOGIN, PASSWORD, FIRST_NAME, "
				+ "LAST_NAME, GROUP, COURSE) VALUES(?,?,?,?,?,?)";

		connection = DbAccess.getConnection();
		try {
			statement = connection.prepareStatement(query);
			statement.setString(1, student.getLogin());
			statement.setString(2, student.getPassword());
			statement.setString(3, student.getFirstName());
			statement.setString(4, student.getLastName());
			statement.setString(5, student.getGroup());
			statement.setInt(6, student.getCourse());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void getStudent(String login, String password) {

	}

	public void updateStudent(Student student) {

	}

	public void deliteStudent(String login) {

	}
}
