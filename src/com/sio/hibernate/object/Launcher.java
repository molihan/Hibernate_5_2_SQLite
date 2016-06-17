package com.sio.hibernate.object;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sio.hibernate.DBMessager;
import com.sio.hibernate.DatabaseService;
import com.sio.hibernate.DatabaseServiceHibernateToSQLiteImpl;
import com.sio.hibernate.entity.Tag;

public class Launcher {

	public static void main(String[] args) {
		DatabaseService service= new DatabaseServiceHibernateToSQLiteImpl();
		service.startService();
		DBMessager messager = null;
		try {
			messager = service.getMessager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Tag tag = new Tag();
		
		tag.setMac("123456");
		
		messager.beginTransaction();
		messager.add(tag);
		messager.commit();
		
		service.stopService();
	}
}
