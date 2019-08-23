package com.pojo.files;

import java.util.Date;

public class ExcelPojo {
	private Date dateValue;
	private String teamMember;
	private String project;
	private String module;
	private String phase;
	private String activity;
	private String description;
	private String ticketid;
	private double totalhrs;
	private String hrsmin;

	public ExcelPojo() {

	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTicketid() {
		return ticketid;
	}

	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}

	public double getTotalhrs() {
		return totalhrs;
	}

	public void setTotalhrs(double totalhrs) {
		this.totalhrs = totalhrs;
	}

	public String getHrsmin() {
		return hrsmin;
	}

	public void setHrsmin(String hrsmin) {
		this.hrsmin = hrsmin;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue2) {
		this.dateValue = dateValue2;
	}

	public String getTeamMember() {
		return teamMember;
	}

	public void setTeamMember(String teamMember) {
		this.teamMember = teamMember;
	}

}
