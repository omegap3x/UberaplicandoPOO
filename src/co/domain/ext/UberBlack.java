package co.domain.ext;

import java.util.*;

import co.domain.Account;
import co.domain.Car;

public class UberBlack extends Car {

	private String typeCarAccepted;
	ArrayList<String> seatsMaterial;

	public UberBlack(Integer id, String license, Integer passagenger, Account driver, String typeCarAccepted,
			ArrayList<String> seatsMaterial) {
		
		super(id, license, passagenger, driver);
		this.seatsMaterial = seatsMaterial;
		this.typeCarAccepted = typeCarAccepted;
	}

	public String getTypeCarAccepted() {
		return typeCarAccepted;
	}

	public void setTypeCarAccepted(String typeCarAccepted) {
		this.typeCarAccepted = typeCarAccepted;
	}

	public ArrayList<String> getSeatsMaterial() {
		return seatsMaterial;
	}

	public void setSeatsMaterial(ArrayList<String> seatsMaterial) {
		this.seatsMaterial = seatsMaterial;
	}
	

}
