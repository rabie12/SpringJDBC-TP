package ma.jit.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.jit.dao.EmployeDao;
import ma.jit.dao.IEmploye;
import ma.jit.entities.Employe;
import ma.jit.service.EmployeService;
import ma.jit.service.IEmployeServ;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		IEmployeServ employeServ= ctx.getBean(EmployeService.class);
		Employe employe = new Employe();
		employe.setName("RAbie");
		employe.setSalary(8500.0);
		employe.setEmail("rabie@hotmail.com");
		employeServ.createEmployeService(employe);
		System.out.println(employeServ.getAllEmployeService());

	}

}
