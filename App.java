package com.CDAC.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        // Load Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        // Create SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open Session
        Session session = factory.openSession();

        // Begin Transaction
        Transaction tx = session.beginTransaction();

        // Create Employee Object
        Employee emp = new Employee(1, "Shreyash");

        // Save Object
        session.persist(emp);

        // Commit Transaction
        tx.commit();

        System.out.println("Employee Saved Successfully!");

        // Close Resources
        session.close();
        factory.close();
    }
}