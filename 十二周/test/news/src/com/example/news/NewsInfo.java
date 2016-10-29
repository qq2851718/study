package com.example.news;

import android.app.Activity;

public class NewsInfo extends Activity {

	
	protected Integer id;
	protected String titleString;
	protected String conterString;
	protected String imgUrl;
	
	
	public NewsInfo(int id, String titleString, String conterString,
			String imgUrl) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.titleString=titleString;
		this.conterString=conterString;
		this.imgUrl=imgUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitleString() {
		return titleString;
	}

	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}

	public String getConterString() {
		return conterString;
	}

	public void setConterString(String conterString) {
		this.conterString = conterString;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NewsInfo [id=" + id + ", titleString=" + titleString
				+ ", conterString=" + conterString + ", imgUrl=" + imgUrl + "]";
	}
	
	
}
