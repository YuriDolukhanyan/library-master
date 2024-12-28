package com.epam.rd.autotasks.library;

public class Publisher {
	private String name;
	private String address;
	private int foundedYear;

	public Publisher(String name, String address, int foundedYear) {
		this.name = name;
		this.address = address;
		this.foundedYear = foundedYear;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}
}