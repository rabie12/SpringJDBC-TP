package ma.jit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.jit.dao.IEmploye;
import ma.jit.entities.Employe;
@Service
public class EmployeService implements IEmployeServ {
	@Autowired
	IEmploye empDao;

	public void createEmployeService(Employe em) {
		empDao.createEmploye(em);
	}

	public List<Employe> getAllEmployeService() {
		return empDao.getAll();
	}

	public void deleteEmployeService(int id) {
		empDao.deleteEmploye(id);
	}

	public void updateEmployeService(int id, double salary) {
		empDao.updateEmploye(id, salary);
	}

	public Employe getByIdEmployeService(int id) {
		return empDao.getById(id);
	}

}
