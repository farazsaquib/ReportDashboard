package com.javatpoint.bean;

import java.sql.Date;

public class Report {

	String sid;
	String build_module;
	String env;
	String build_stage;
	String build_status;
	String reason;
	Date build_date;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getBuild_module() {
		return build_module;
	}
	public void setBuild_module(String build_module) {
		this.build_module = build_module;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getBuild_stage() {
		return build_stage;
	}
	public void setBuild_stage(String build_stage) {
		this.build_stage = build_stage;
	}
	public String getBuild_status() {
		return build_status;
	}
	public void setBuild_status(String build_status) {
		this.build_status = build_status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getBuild_date() {
		return build_date;
	}
	public void setBuild_date(Date build_date) {
		this.build_date = build_date;
	} 

}
