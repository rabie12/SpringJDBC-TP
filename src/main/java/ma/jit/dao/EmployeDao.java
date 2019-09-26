package ma.jit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ma.jit.entities.Employe;
@Repository
public class EmployeDao implements IEmploye{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private final String SQL_FIND_EMPLOYE = "select * from employe where id = ?";
    private final String SQL_DELETE_EMPLOYE = "delete from employe where id = ?";
    private final String SQL_UPDATE_EMPLOYE = "update employe set salary = ? where id = ?";
    private final String SQL_GET_ALL = "select * from employe";
    private final String SQL_INSERT_EMPLOYE = "insert into employe(name, salary, email) values(?,?,?)";
    

	public void createEmploye(Employe em) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(SQL_INSERT_EMPLOYE,em.getName(), em.getSalary(),em.getEmail());
	}
	public List<Employe> getAll() {
		List<Employe> listEmploye = jdbcTemplate.query(SQL_GET_ALL,  new RowMapEmploye());
		return listEmploye;
	}

	public void deleteEmploye(int id) {
		jdbcTemplate.update(SQL_DELETE_EMPLOYE,id);
		
	}

	public void updateEmploye(int id, double salary) {
		jdbcTemplate.update(SQL_UPDATE_EMPLOYE,salary,id);
		
	}

	public Employe getById(int id) {
		Employe emp =jdbcTemplate.queryForObject(SQL_FIND_EMPLOYE, new RowMapEmploye(), id);
		return emp;
	}

}
