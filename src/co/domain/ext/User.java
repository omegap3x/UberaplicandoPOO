package co.domain.ext;

import co.domain.Account;

public class User extends Account {

	public User(Integer id, String name, String document, String email, String password) {
		super(id, name, document, email, password);
	}

}
