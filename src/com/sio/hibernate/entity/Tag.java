package com.sio.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Tag implements ORMEntity {

	private int id;
	private String mac;
	/*
	 * 0	- nil
	 * 1	- ready
	 * 2	- QUEUE
	 * 3	- sending
	 * 4	- received
	 * 5	- complete
	 * 9	- error
	 */
	private int status;
	private int dbm;
	private String ip;
	private String serialize;
	private String interval;
	private String expect_code;
	private String last_respond_time;
	/*
	 * 0	- nil
	 * 1	- online
	 * 2	- offline
	 * 
	 */
	private int online;
	private String model;
	private int battary;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Override
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the dbm
	 */
	public int getDbm() {
		return dbm;
	}

	/**
	 * @param dbm the dbm to set
	 */
	public void setDbm(int dbm) {
		this.dbm = dbm;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the serialize
	 */
	public String getSerialize() {
		return serialize;
	}

	/**
	 * @param serialize the serialize to set
	 */
	public void setSerialize(String serialize) {
		this.serialize = serialize;
	}

	/**
	 * @return the interval
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * @param interval the interval to set
	 */
	public void setInterval(String interval) {
		this.interval = interval;
	}

	/**
	 * @return the expect_code
	 */
	public String getExpect_code() {
		return expect_code;
	}

	/**
	 * @param expect_code the expect_code to set
	 */
	public void setExpect_code(String expect_code) {
		this.expect_code = expect_code;
	}

	/**
	 * @return the last_respond_time
	 */
	public String getLast_respond_time() {
		return last_respond_time;
	}

	/**
	 * @param last_respond_time the last_respond_time to set
	 */
	public void setLast_respond_time(String last_respond_time) {
		this.last_respond_time = last_respond_time;
	}

	/**
	 * @return the online
	 */
	public int getOnline() {
		return online;
	}

	/**
	 * @param online the online to set
	 */
	public void setOnline(int online) {
		this.online = online;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the battary
	 */
	public int getBattary() {
		return battary;
	}

	/**
	 * @param battary the battary to set
	 */
	public void setBattary(int battary) {
		this.battary = battary;
	}

}
