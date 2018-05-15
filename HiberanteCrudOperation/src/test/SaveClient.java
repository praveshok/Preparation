package test;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory s=cfg.buildSessionFactory();
	   Session session= s.openSession();
	   Transaction t = session.beginTransaction();
	   
	   Student st = new Student();
	   /*st.setId(200);
	   st.setName("ramesh");
	   st.setEmail("xyz@kbcmn");
	   st.setAddress("k city");*/
	  
	   //int pk=(Integer) session.save(st);
	   st.setId(203);
	  // session.update(st);
	   session.delete(st);
	   //System.out.println(pk);
	   //committ transcation
	   t.commit();
	   session.close();
	   s.close();
	   System.out.println("data insertion successfully");
	   
	}
}
