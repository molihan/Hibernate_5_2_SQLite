package com.sio.hibernate;

import com.sio.hibernate.entity.ORMEntity;

/**
 * Database communication interface. This object is handling variant functions face to database.<br>
 * <H2>This is an ORM framework class.</H2>
 * @author S
 * 
 */
public interface DBMessager {
	
	DBMessager beginTransaction();
	/**
	 * For particular Aspect Oriented Programming(AOP) design you need to call this function to commit your action.<br>
	 * In case the program won't leak any resource please call this function after transaction.<br>
	 * <p>
	 * 	e.g. style 1
	 * <br>
	 * 		objectDBMessager.beginTransaction();<br>
	 * 		objectDBMessager.add(obj1);<br>
	 * 		objectDBMessager.add(obj2);<br>
	 * 		objectDBMessager.add(obj3);<br>
	 * 		objectDBMessager.commit();<br>
	 * </p>
	 * <p>
	 * 	e.g. style 2
	 * <br>
	 * 		objectDBMessager.beginTransaction().add(obj1).add(obj2).add(obj3).commit();
	 * </p>
	 * @return
	 */
	DBMessager commit();
	/**
	 * Add an object to database.
	 * @param obj the object entity.
	 * @return object of DBMessager
	 */
	DBMessager add (Object obj);
	/**
	 * Remove an object from database.
	 * @param obj the referring object.
	 * @return object of DBMessager
	 */
	DBMessager remove(Object obj);
	/**
	 * Get an object from database with specific index.
	 * @param index virtual numeric index
	 * @param clazz declare the mapping class
	 * @return T entity.
	 */
	<T> T get(Class<T> clazz, int index);
	/**
	 * Get an object from database with an object index.
	 * @param entity referring object
	 * @return	object entity
	 */
	Object get(ORMEntity entity);
	/**
	 * Modify an actual object.
	 * @param obj this object represented a row of record of database, and it will be updated.
	 * @return if succeed return true, advise false.
	 */
	boolean modify(Object obj);
	/**
	 * Close the connection. This function destroys the connection channel of communication.<br>
	 * So, this is NOT the ending function of beginTansaction(). DO NOT MISUNDERSTAND.<br>
	 * If just for break of data transaction or commit action please call another function 'commit'
	 */
	void close();
}
