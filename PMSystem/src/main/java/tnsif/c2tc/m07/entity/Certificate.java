package tnsif.c2tc.m07.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
	@Id
	private int cid;
	private int year;
	private String College;
	
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", year=" + year + ", College=" + College + "]";
	}
	
	
}
