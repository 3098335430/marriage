package com.marriage.entity;

public class Advice {
	private Integer aid;
	private Integer CaseId;
	private String advice;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getCaseId() {
		return CaseId;
	}
	public void setCaseId(Integer caseId) {
		CaseId = caseId;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	@Override
	public String toString() {
		return "Advice [aid=" + aid + ", CaseId=" + CaseId + ", advice=" + advice + "]";
	}
	public Advice(Integer aid, Integer caseId, String advice) {
		super();
		this.aid = aid;
		CaseId = caseId;
		this.advice = advice;
	}
	public Advice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  
}
