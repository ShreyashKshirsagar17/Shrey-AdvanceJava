package com.CDAC.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadEmployee {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Employee emp = session.get(Employee.class, 1);

        if(emp != null) {
            System.out.println("ID : " + emp.getId());
            System.out.println("Name : " + emp.getName());
        } else {
            System.out.println("Employee not found");
        }

        session.close();
        factory.close();
    }
}