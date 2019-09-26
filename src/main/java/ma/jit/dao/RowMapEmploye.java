package ma.jit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ma.jit.entities.Employe;

public class RowMapEmploye implements RowMapper<Employe>{
	//Mappage
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException{
		Employe employe = new Employe();
		employe.setId(rs.getInt("id"));
		employe.setName(rs.getString("name"));
		employe.setSalary(rs.getFloat("salary"));
		employe.setEmail(rs.getString("email"));
		return employe;
	}

}
