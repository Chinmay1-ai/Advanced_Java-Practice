package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Library;

public class LibraryDao {

	public void insertData(Library e) {

	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    cfg.addAnnotatedClass(Library.class);

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction tr = ss.beginTransaction();

	    String sql = "insert into library(libraryId, libraryName, location, totalBooks, librarianName, contactNumber, establishedYear) "
	            + "values (:id, :name, :loc, :books, :librarian, :contact, :year)";

	    MutationQuery query = ss.createNativeMutationQuery(sql);

	    query.setParameter("id", e.getLibraryId());
	    query.setParameter("name", e.getLibraryName());
	    query.setParameter("loc", e.getLocation());
	    query.setParameter("books", e.getTotalBooks());
	    query.setParameter("librarian", e.getLibrarianName());
	    query.setParameter("contact", e.getContactNumber());
	    query.setParameter("year", e.getEstablishedYear());

	    query.executeUpdate();

	    tr.commit();
	    ss.close();

	    System.out.println("Data inserted successfully...");
	}
	
	
	
	public void deleteData(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete from Library where libraryId  : id ";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", id);
		query.executeUpdate();
		

		tr.commit();
		ss.close();

		System.out.println("Data is deleted...");
	}

	public void updateData(Library l) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		

		 String hql = "update Library set libraryName = :name, location = :loc, totalBooks = :books where libraryId = :id";

		    MutationQuery query = ss.createMutationQuery(hql);

		    query.setParameter("name", l.getLibraryName());
		    query.setParameter("loc", l.getLocation());
		    query.setParameter("books", l.getTotalBooks());
		    query.setParameter("id", l.getLibraryId());

		    query.executeUpdate();

		    tr.commit();
		    ss.close();

		    System.out.println("Data updated...");
		}

	public void getSingleRecord(int id) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Library where libraryId =: id";
		org.hibernate.query.Query<Library> query = ss.createQuery(hqlQuery, Library.class);
		query.setParameter("id", id);
		Library l = query.uniqueResult();
		System.out.println(l);

		tr.commit();
		ss.close();

	}

	public void getAllRecord() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Library";
		Query<Library> query = ss.createQuery(hqlQuery, Library.class);
		List<Library> list = query.getResultList();

		for (Library library : list) {
			System.out.println(library);
		}

		tr.commit();
		ss.close();

	}

}
