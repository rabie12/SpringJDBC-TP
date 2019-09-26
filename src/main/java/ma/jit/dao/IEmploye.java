package ma.jit.dao;

import java.util.List;

import ma.jit.entities.Employe;

public interface IEmploye {
	public void createEmploye(Employe em);
	public List <Employe> getAll();
	public void deleteEmploye(int id);
	public void updateEmploye(int id, double salary);
	public Employe getById(int id);

}
