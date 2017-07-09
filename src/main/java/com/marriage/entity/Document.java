package com.marriage.entity;

public class Document {
	private Integer did;
	private String title;
	private String content;
	private Integer CaseId;
	private String label;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCaseId() {
		return CaseId;
	}
	public void setCaseId(Integer caseId) {
		CaseId = caseId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "Document [did=" + did + ", title=" + title + ", content=" + content + ", CaseId=" + CaseId + ", label="
				+ label + "]";
	}
	public Document(Integer did, String title, String content, Integer caseId, String label) {
		super();
		this.did = did;
		this.title = title;
		this.content = content;
		CaseId = caseId;
		this.label = label;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
