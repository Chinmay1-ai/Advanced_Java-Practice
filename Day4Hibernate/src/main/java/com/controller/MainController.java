package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;
import com.entity.Order;

public class MainController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Order.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Customer c = new Customer();
		c.setCustomerId(3);
		c.setName("Chinmay");
		c.setEmail("chinmay@gmail.com");
		c.setPhone(7263840040l);
		c.setCity("Pune");

		Order o1 = new Order();
		o1.setOrderDate("15-03-2026");
		o1.setProductName("SmartPhone");
		o1.setPrice(25000);
		o1.setQuantity(2);

		Order o2 = new Order();
		o2.setOrderDate("17-03-2026");
		o2.setProductName("Earbuds");
		o2.setPrice(2500);
		o2.setQuantity(4);

		Order o3 = new Order();
		o3.setOrderDate("19-03-2026");
		o3.setProductName("SunsCream");
		o3.setPrice(500);
		o3.setQuantity(4);

		List<Order> list = new ArrayList<Order>();
		list.add(o1);
		list.add(o2);
		list.add(o3);

		ss.persist(o1);
		ss.persist(o2);
		ss.persist(o3);
		c.setOrders(list);
		ss.persist(c);

		System.out.println("Data is inserted...!");

//		String hql = "select p from Person p join fetch p.passport";
//
//		Query<Person> query = ss.createQuery(hql, Person.class);
//
//		List<Person> list = query.getResultList();
//
//		for (Person person : list) {
//
//			System.out.println("Person Name: " + person.getName());
//			System.out.println("City: " + person.getCity());
//
//			Passport pass = person.getPassport();
//
//			System.out.println("Passport No: " + pass.getPassportNumber());
//			System.out.println("Nationality: " + pass.getNationality());
//
//			System.out.println("-------------------------");
//		}

//		Person person = ss.get(Person.class, 111);
//		Passport pass = person.getPassport();
//
//
//		ss.remove(person);
//		ss.remove(pass);
//
//		System.out.println("Data is Deleted....!");

//		Person person = ss.get(Person.class, 111);
//
//		person.setCity("Mumbai");
//		person.setEmail("chinmaypawar@gmail.com");
//
//		Passport pass = person.getPassport();
//		pass.setPlaceOfIssue("Mumbai");
//
//		ss.merge(person);
//		
//		System.out.println("Data is Updated....!");

//		
//

		tr.commit();
		ss.close();

	}
}