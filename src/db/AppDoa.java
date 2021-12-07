package db;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.Transaction;

import pojo.Diagnostics;
import pojo.MedicineDb;
import pojo.Medicine_issue;
import pojo.Patient;
import pojo.Diagnostic_issue;



public class AppDoa {
	  public boolean validate(String userName, int password) {

	        Transaction transaction = null;
	        Patient user = null;
	        try  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an user object
	            user = (Patient) session.createQuery("FROM Patient U WHERE U.name = :userName").setParameter("userName", userName)
	                .uniqueResult();
System.out.println(user.getssnid());
	            if (user != null && user.getssnid()==password) {
	            	System.out.println("true");
	                return true;
	            }
	            System.out.println(  user.getssnid()==password);
	           
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return false;
	    }
	public int insert(Patient patient) {
		
		  Transaction transaction = null;
		  int id;
		  try  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	transaction = session.beginTransaction();
	        	session.save(patient);
	        	
	        	transaction.commit();
	        	id=1;
	        	 return id;
	        	
		  } 
		  catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	               
	            }
	            e.printStackTrace();
	        }
		  return 0;
		 
		
	}
	
	public Patient search(int pid) {

		  Transaction transaction = null;
		  Patient p=null;
		
		  try  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	transaction = session.beginTransaction();
	        	 p=(Patient)session.get(Patient.class,pid);
	        	transaction.commit();
	        
	        	 return p;
	        	
		  } 
		  catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	               
	            }
	            e.printStackTrace();
	        }
		  return p;
	}
	
public String delete(int pid) {
	  Transaction transaction = null;
	 String msg=null;
	  try  {
      	Session session = HibernateUtil.getSessionFactory().openSession();
      	transaction = session.beginTransaction();
      	Patient p=(Patient)session.get(Patient.class,pid);
      	session.delete(p);
      	transaction.commit();
      	msg="Delete patient Sucessfully";
      	 return msg;
      	
	  } 
	  catch (Exception e) {
          if (transaction != null) {
              transaction.rollback();
             
          }
          e.printStackTrace();
      }
	  msg="Some error in database";
	  return msg;
	}

public List allpatients() {
	 Transaction transaction = null;
	 List patients=new ArrayList();
	patients=null;
	  try  {
      	Session session = HibernateUtil.getSessionFactory().openSession();
      	transaction = session.beginTransaction();
      Query q=session.createQuery("from Patient");
      patients=q.list();
      	transaction.commit();
      	
      	return patients;
	  } 
	  catch (Exception e) {
          if (transaction != null) {
              transaction.rollback();
             
          }
          e.printStackTrace();
      }
	 
	  return patients;
	}
public List diagnostics(int pid) {
	
	Transaction transaction = null;
	 List test=new ArrayList();
	
	  try  {
     	Session session = HibernateUtil.getSessionFactory().openSession();
     	transaction = session.beginTransaction();
     Query q=session.createQuery("from Patient");
     test=q.list();
     	transaction.commit();
     	
     	return test;
	  } 
	  catch (Exception e) {
         if (transaction != null) {
             transaction.rollback();
            
         }
         e.printStackTrace();
     }
	 
	  return test;
	
}
public MedicineDb searchmedicine(String mname,int quantity) {

	  Transaction transaction = null;
	  MedicineDb m=null;
	
	  try  {
      	Session session = HibernateUtil.getSessionFactory().openSession();
      	transaction = session.beginTransaction();
      	 Query q= session.createQuery("FROM MedicineDb U WHERE U.mname = :mname and U.avalible_quantity >= :qunt").setParameter("mname", mname).setParameter("qunt",quantity);
      	m=(MedicineDb) q.uniqueResult();
      	System.out.println(m);
      	transaction.commit();
      
      	 return m;
      	
	  } 
	  catch (Exception e) {
          if (transaction != null) {
              transaction.rollback();
             
          }
          e.printStackTrace();
          return m;
      }
	 
}
public void savemed(Medicine_issue m) {
	 Transaction transaction = null;
	  
	  try  {
       	Session session = HibernateUtil.getSessionFactory().openSession();
       	transaction = session.beginTransaction();
       	session.save(m);
       	
       	transaction.commit();
       
       	
	  } 
	  catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
              
           }
           e.printStackTrace();
       }
	  
	
}
public Diagnostics searchtest(String name) {
	 Transaction transaction = null;
	 Diagnostics d=null;
	  try  {
      	Session session = HibernateUtil.getSessionFactory().openSession();
      	transaction = session.beginTransaction();
      	 Query q= session.createQuery("FROM Diagnostics d WHERE d.tname = :mname").setParameter("mname",name);
       	d=(Diagnostics) q.uniqueResult();
      	
      	transaction.commit();
      return d;
      	
	  } 
	  catch (Exception e) {
          if (transaction != null) {
              transaction.rollback();
             
          }
          e.printStackTrace();
          return d;
      }
	  
	
	 
		  
		  
	  }
public void savetest(Diagnostic_issue d) {
	 Transaction transaction = null;
	  
	  try  {
      	Session session = HibernateUtil.getSessionFactory().openSession();
      	transaction = session.beginTransaction();
    
      	session.save(d);
      	
      	transaction.commit();
      
      	
	  } 
	  catch (Exception e) {
          if (transaction != null) {
              transaction.rollback();
             
          }
          e.printStackTrace();
      }
	  
	
	
}

public List<MedicineDb> getmedicine(int pid){
	Transaction transaction = null;
	List<MedicineDb> m=null;
	
	  try  {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	transaction = session.beginTransaction();
    	 Query q= session.createQuery("FROM Medicine_issue U WHERE U.pid=:pid").setParameter("pid",pid);
    	m=q.list();
    	
    	transaction.commit();
    
    	 return m;
    	
	  } 
	  catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
           
        }
        e.printStackTrace();
        return m;
    }
	
	
}

public List<Diagnostics> gettest(int pid){
	Transaction transaction = null;
	List<Diagnostics> d=null;
	
	  try  {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	transaction = session.beginTransaction();
    	 Query q= session.createQuery("FROM Diagnostic_issue U WHERE U.pid=:pid").setParameter("pid",pid);
    	d=q.list();
    	
    	transaction.commit();
    
    	 return d;
    	
	  } 
	  catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
           
        }
        e.printStackTrace();
        return d;
    }
	
	
}
}


