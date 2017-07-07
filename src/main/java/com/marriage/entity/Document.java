package com.marriage.entity;

public class Document {
	private long dId;// 文档ID

	private String title;// 文档名称

	private String content;//文档内容

	public long getdId() {
		return dId;
	}

	public void setdId(long dId) {
		this.dId = dId;
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

	@Override
	public String toString() {
		return "Document [dId=" + dId + ", title=" + title + ", content=" + content + "]";
	}

	public Document(long dId, String title, String content) {
		super();
		this.dId = dId;
		this.title = title;
		this.content = content;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
