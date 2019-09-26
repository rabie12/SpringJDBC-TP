package ma.jit.service;

import java.util.List;

import ma.jit.entities.Employe;

public interface IEmployeServ {

	void createEmployeService(Employe em);

	List<Employe> getAllEmployeService();

	void deleteEmployeService(int id);

	void updateEmployeService(int id, double salary);

	Employe getByIdEmployeService(int id);

}