package com.nit.boot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceRepositary {

	@Autowired
	private StudentTablerepo repo;

	public void save() {
		Examplestudent c = new Examplestudent();

		c.setNickName("Nagesh");
		c.setRollnumber(496);
		c.setState("Telagana");

		repo.save(c);
		System.out.println("inserted .......");
	}

	public void SaveAll() {

		Examplestudent c = new Examplestudent();

		c.setNickName("Kishore");
		c.setRollnumber(869);
		c.setState("Andhra Pradesh");

		Examplestudent c1 = new Examplestudent();

		c1.setNickName("Rakesh");
		c1.setRollnumber(556);
		c1.setState("Uttar Pradesh");

		Examplestudent c2 = new Examplestudent();

		c2.setNickName("Krishna");
		c2.setRollnumber(660);
		c2.setState("Kerla");
		
		Examplestudent c3 = new Examplestudent();

		c3.setNickName("Nagesh");
		c3.setRollnumber(660);
		c3.setState("TeLagana");
		
		repo.saveAll(Arrays.asList(c,c1,c2,c3));
		
		System.out.println("All data Inserted......");

	}
	
	public void update() {
		int id=532;
		Examplestudent stu=repo.findById(id).get();
		
		stu.setNickName("PavanKumar");
		stu.setState("Tenali(AP)");
		
		repo.save(stu);
		
		System.out.println("Update Record .........");
	}
	
	public void FindById() {
		
		int x=532;
		
		Examplestudent stu=repo.findById(x).get();
		System.out.println("id is :"+x);
		System.out.println("532 id Details :"+stu.getNickName());
		System.out.println("532 id Details :"+stu.getState());
		
	}
	
	public void deleteById() {
		
		int id=890;
		repo.deleteById(id);
		System.out.println("Deleted Id :"+id);
	}
	
	public void deleteAll() {
		repo.deleteAll();
		System.out.println("Deleted All Records......");
	}
}
