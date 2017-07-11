package com.marriage.entity;

public class Case {
  private Integer cid;
  private String type;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Case [cid=" + cid + ", type=" + type + "]";
}
public Case(Integer cid, String type) {
	super();
	this.cid = cid;
	this.type = type;
}
public Case() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
