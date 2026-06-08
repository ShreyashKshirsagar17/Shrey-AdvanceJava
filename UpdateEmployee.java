package com.CDAC.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee emp = session.get(Employee.class, 1);

        if(emp != null) {

            emp.setName("Shreyash Kshirsagar");

            tx.commit();

            System.out.println("Employee Updated Successfully!");
        }
        else {
            System.out.println("Employee Not Found");
        }

        session.close();
        factory.close();
    }
}