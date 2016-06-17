package com.sio.hibernate;
/**
 * Database service interface.
 * @author S
 *
 */
public interface DatabaseService {
	
	/**
	 * Start database service. This may take vast of time<br>
	 * call stopService before software close.<>
	 */
	void startService();
	/**
	 * Stop database service. Clear-up memory, connection and sessions.
	 */
	void stopService();
	/**
	 * Get a messager for communicate with current database of service.
	 * @return
	 */
	DBMessager getMessager() throws Exception;
	
}
