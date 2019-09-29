package co.main;

import co.domain.Account;
import co.domain.ext.Uberx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uberx x = new Uberx(15, "123", 4, new Account(1, "carlos", "as11", "xdasda@h", "1234f"), "panda", "2019");

		x.setPassagenger(15);
		x.getPassagenger();
		x.setLicense("123a");
		System.out.println(x.getLicense());
	}

}
