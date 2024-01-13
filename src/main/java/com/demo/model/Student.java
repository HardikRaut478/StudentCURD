package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int sid;
	public String name;
	public int yearOfPassing;
	public double percentage;
	public String Collage;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", yearOfPassing=" + yearOfPassing + ", percentage="
				+ percentage + ", Collage=" + Collage + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getCollage() {
		return Collage;
	}

	public void setCollage(String collage) {
		Collage = collage;
	}

}
