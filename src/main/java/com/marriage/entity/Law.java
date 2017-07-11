package com.marriage.entity;

public class Law {
	private Integer lid;
	private String law;
	private Integer CaseId;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLaw() {
		return law;
	}
	public void setLaw(String law) {
		this.law = law;
	}
	public Integer getCaseId() {
		return CaseId;
	}
	public void setCaseId(Integer caseId) {
		CaseId = caseId;
	}
	@Override
	public String toString() {
		return "Law [lid=" + lid + ", law=" + law + ", CaseId=" + CaseId + "]";
	}
	public Law(Integer lid, String law, Integer caseId) {
		super();
		this.lid = lid;
		this.law = law;
		CaseId = caseId;
	}
	public Law() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
