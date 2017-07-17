package com.marriage.entity;

public class Word {
private Integer wid;
private String title;
private String content;
private String word;
public Integer getWid() {
	return wid;
}
public void setWid(Integer wid) {
	this.wid = wid;
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
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
@Override
public String toString() {
	return "Word [wid=" + wid + ", title=" + title + ", content=" + content + ", word=" + word + "]";
}
public Word(Integer wid, String title, String content, String word) {
	super();
	this.wid = wid;
	this.title = title;
	this.content = content;
	this.word = word;
}
public Word() {
	super();
	// TODO Auto-generated constructor stub
}

}
