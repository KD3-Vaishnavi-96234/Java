package com.sunbeam.date;

public class Date {
	int month;
	int day;
	int year;

	public Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 13 && month != 0)
			this.month = month;
		else
			System.out.println("Enter valid month");
	}

	public int getDay() {

		return day;
	}

	public void setDay(int day) {
		if (day < 32 && day != 0)
			this.day = day;
		else
			System.out.println("Enter valid day");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
