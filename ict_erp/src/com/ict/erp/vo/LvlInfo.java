package com.ict.erp.vo;

public class LvlInfo {            /*쿼리 1:1 매핑위함 그리고 art+g,art+t  눌러서 불러온다.*/
										/*마지막으로 생성자 생성 토드 알트 씨*/
	private int lvl;
	private String liName;
	private String liDesc;
	
	public LvlInfo(int lvl, String liName, String liDesc) {
		super();
		this.lvl = lvl;
		this.liName = liName;
		this.liDesc = liDesc;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getLiDesc() {
		return liDesc;
	}
	
	public String toString() {
		return "LvlInfo [lvl=" + lvl + ", liName=" + liName + ", liDesc=" + liDesc + "]";
	}
	public void setLiDesc(String liDesc) {
		this.liDesc = liDesc;
	}
}
