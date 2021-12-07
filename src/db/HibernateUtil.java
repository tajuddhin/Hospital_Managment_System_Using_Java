package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import pojo.Diagnostic_issue;
import pojo.Diagnostics;
import pojo.MedicineDb;
import pojo.Medicine_issue;
import pojo.Patient;


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
         
                
                configuration.addAnnotatedClass(Patient.class).addAnnotatedClass(Medicine_issue.class).addAnnotatedClass(MedicineDb.class).addAnnotatedClass(Diagnostics.class).addAnnotatedClass(Diagnostic_issue.class);

                StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                System.out.println("Hibernate Java Config serviceRegistry created");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}