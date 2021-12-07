package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.SQLException;

import pojo.Patient;

public class ApplicationDao {

	

	public int registerUser(Patient patient) throws SQLException {
		Connection connection = DBConnection.getConnectionToDatabase();
		String insertUserQuery = "insert into patients values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(insertUserQuery);
		statement.setInt(1, patient.getssnid());
		statement.setString(2, patient.getName());
		statement.setInt(3, patient.getAge());
		statement.setDate(4, (Date) patient.getDoa());			
		statement.setString(5, patient.getTypeofbed());
		statement.setString(6, patient.getAddress());
		
		statement.setString(7, patient.getState());
		statement.setString(8, patient.getCity());
		
		
		System.out.println(insertUserQuery);

		int rowsAffected = statement.executeUpdate();
		return rowsAffected;
	}
/*
public Patient searchPatient(String word) throws SQLException {
	Connection connection = DBConnection.getConnectionToDatabase();
	String query="Select * from patients";
	Statement smt=connection.createStatement();
	ResultSet rs=smt.executeQuery(query);
	Patient p =new Patient(rs.getInt("ssnid"), rs.getString("name"), rs.getInt("age"), rs.getDate("doa"), rs.getString("typeofbed"), rs.getString("address"), rs.getString("city"), rs.getString("state"));
	
	
	
	
	return p;
	
}*/
}
