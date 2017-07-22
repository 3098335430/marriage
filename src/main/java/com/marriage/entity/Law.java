package com.marriage.entity;

public class Law {
	private Integer lid;
	private String lawContent;
	private Integer CaseId;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Integer getCaseId() {
		return CaseId;
	}
	public void setCaseId(Integer caseId) {
		CaseId = caseId;
	}
	public String getLawContent() {
		return lawContent;
	}
	public void setLawContent(String lawContent) {
		this.lawContent = lawContent;
	}
	@Override
	public String toString() {
		return "Law [lid=" + lid + ", lawContent=" + lawContent + ", CaseId=" + CaseId + "]";
	}
	public Law(Integer lid, String lawContent, Integer caseId) {
		super();
		this.lid = lid;
		this.lawContent = lawContent;
		CaseId = caseId;
	}
	public Law() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
