package com.sio.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sio.hibernate.entity.ORMEntity;

public class DBMessagerSQLiteImpl implements DBMessager {
	private SessionFactory sessionFactory;
	private Session session;
	
	public DBMessagerSQLiteImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.getCurrentSession();
		if(session == null){
			session = sessionFactory.openSession();
		}
	}
	
	@Override
	public DBMessager add(Object obj) {
		session.save(obj);
		return this;
	}

	@Override
	public DBMessager remove(Object obj) {
		session.delete(obj);
		return this;
	}

	@Override
	public <T> T get(Class<T> clazz, int index) {
//		T t = session.get(clazz, index);
		return null;
	}

	@Override
	public Object get(ORMEntity entity) {
		return null;
	}

	@Override
	public boolean modify(Object obj) {
		return false;
	}

	@Override
	public void close() {
		if(sessionFactory != null)	sessionFactory.close();
	}

	@Override
	public DBMessager beginTransaction() {
		session.beginTransaction();
		return this;
	}

	@Override
	public DBMessager commit() {
		session.getTransaction().commit();
		session.close();
		return this;
	}

}
