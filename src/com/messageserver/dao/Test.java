package com.messageserver.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.messageserver.entity.Faculty;
import com.messageserver.entity.Login;
import com.messageserver.entity.Organization;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration conf = new Configuration().configure();
			SessionFactory sf = conf.buildSessionFactory();
			Session ss=sf.openSession();
			System.out.println("table created");
		} catch (Exception e) {
			System.out.println("not created");
		}
	}

}
