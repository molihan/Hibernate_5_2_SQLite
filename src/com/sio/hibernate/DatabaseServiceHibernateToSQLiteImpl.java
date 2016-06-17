package com.sio.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DatabaseServiceHibernateToSQLiteImpl implements DatabaseService {
	private SessionFactory factory;
	@Override
	public void startService() {
		Configuration config  = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		//创建工厂
		factory = config.buildSessionFactory(serviceRegistry);
	}

	@Override
	public void stopService() {
		if(factory != null ){
			factory.close();
		}
		factory = null;
	}

	@Override
	public DBMessager getMessager() throws Exception {
		if(factory == null){
			throw new Exception("DatabaseServiceUnitializedExeption");
		}
		return new DBMessagerSQLiteImpl(factory);
	}

}
