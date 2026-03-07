package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Passport;
import com.entity.Person;

public class PersonsDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Passport.class);
		cfg.addAnnotatedClass(Person.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Passport p = new Passport();
		p.setPassportId(103);
		p.setPassportNumber("66999246269");
		p.setIssueDate("10-05-2025");
		p.setExpiryDate("10-05-2035");
		p.setNationality("Indian");
		p.setPlaceOfIssue("Pune");
		p.setPassportType("International");
		ss.persist(p);

		Person p1 = new Person();
		p1.setPersonId(113);
		p1.setName("Bhavik");
		p1.setAge(24);
		p1.setGender("Male");
		p1.setCity("Pune");
		p1.setCountry("India");
		p1.setPhoneNumber(8596452358l);
		p1.setEmail("bhavik@gmail.com");
		p1.setPassport(p);
		ss.persist(p1);

		System.out.println("Data is inserted...!");
		tr.commit();
		ss.close();
	}

	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Passport.class);
		cfg.addAnnotatedClass(Person.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Person person = ss.get(Person.class, 111);

		Passport pass = person.getPassport();

		ss.remove(person);
		ss.remove(pass);

		System.out.println("Data is Deleted....!");

		tr.commit();
		ss.close();

	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Passport.class);
		cfg.addAnnotatedClass(Person.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Person person = ss.get(Person.class, 111);

		person.setCity("Mumbai");
		person.setEmail("chinmaypawar@gmail.com");

		Passport pass = person.getPassport();
		pass.setPlaceOfIssue("Mumbai");

		ss.merge(person);

		System.out.println("Data is Updated....!");

		tr.commit();
		ss.close();

		System.out.println("Data updated...");
	}

	public void getAllRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Passport.class);
		cfg.addAnnotatedClass(Person.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "select p from Person p join fetch p.passport";

		Query<Person> query = ss.createQuery(hql, Person.class);

		List<Person> list = query.getResultList();

		for (Person person : list) {

			System.out.println("Person Name: " + person.getName());
			System.out.println("City: " + person.getCity());

			Passport pass = person.getPassport();

			System.out.println("Passport No: " + pass.getPassportNumber());
			System.out.println("Nationality: " + pass.getNationality());

			System.out.println("-------------------------");
		}

		tr.commit();
		ss.close();

	}

}
