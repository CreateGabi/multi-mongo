package com.multi.mongoDB;

public class MemberVO {

	private String _id;
	private String uid;
	private String pw;
	private String name;
	private String tel;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberVO [_id=" + _id + ", id=" + uid + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
