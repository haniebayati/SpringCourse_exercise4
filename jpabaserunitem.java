package ir.freeland.springboot.relation.onetoone.foreignkeybased;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class jpabaserunitem {
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save
		transaction.begin();
		item item = new item();
		item.setitemname("book");
		item.setcategory("learning");
		item.setprice(220);
    	session.persist(item);
		
    	transaction.commit();
    	
    	//Find
    	transaction.begin();
    	List<item> allitem = session.createQuery("from item" , item.class).getResultList();
    	allitem.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();

    	//Update
    	transaction.begin();
    	allitem.get(0).setitemname("notebook");
    	transaction.commit();
    
    	//Delete
    	transaction.begin();
    	session.remove(allitem.get(1) );
    	transaction.commit();
    	
	}
}
