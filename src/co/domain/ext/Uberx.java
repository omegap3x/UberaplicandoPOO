package co.domain.ext;

import co.domain.Account;
import co.domain.Car;

public class Uberx extends Car {

	private String brand;
	private String model;

	public Uberx(Integer id, String license, Integer passagenger, Account driver, String brand, String model) {
		super(id, license, passagenger, driver);
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
