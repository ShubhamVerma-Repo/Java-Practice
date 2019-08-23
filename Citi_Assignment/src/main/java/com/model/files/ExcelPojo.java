package com.model.files;

public class ExcelPojo 
{
	
	private String datevalue;
	private String teammember;
	private String project;
	private String module;
	private String phase;
	private String activity;
	private String description;
	private String ticketid;
	private String totalhrs;
	private String hrsmin;
	
	
	public ExcelPojo(String column1,String column2,String column3,String column4,String column5,String column6,String column7,String column8,String column9,String column10)
	{
		this.datevalue=column1;
		this.teammember=column2;
		this.project=column3;
		this.module=column4;
		this.phase=column5;
		this.activity=column6;
		this.description=column7;
		this.ticketid=column8;
		this.totalhrs=column9;
		this.hrsmin=column10;
	}


	public String getTeammember() {
		return teammember;
	}


	public void setTeammember(String teammember) {
		this.teammember = teammember;
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


	public String getTotalhrs() {
		return totalhrs;
	}


	public void setTotalhrs(String totalhrs) {
		this.totalhrs = totalhrs;
	}


	public String getHrsmin() {
		return hrsmin;
	}


	public void setHrsmin(String hrsmin) {
		this.hrsmin = hrsmin;
	}


	public String getDatevalue() {
		return datevalue;
	}


	public void setDatevalue(String datevalue) {
		this.datevalue = datevalue;
	}
	

}
