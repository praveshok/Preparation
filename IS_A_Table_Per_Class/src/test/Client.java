package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEEmployee;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=	cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	SEEmployee se = new SEEmployee(111, "Raja", "Raja@xyz", 4000, "ORM");
	HEmployee he = new HEmployee(222, "hari", "Hari@xyz", 7000, 8);
	Admin ad = new Admin(333, "harish", "harish@xyz", 8000, "Bangalore");
	s.save(se);
	s.save(he);
	s.save(ad);
	t.commit();
	s.close();
	sf.close();
	}
}
