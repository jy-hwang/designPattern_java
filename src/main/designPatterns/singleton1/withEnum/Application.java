package main.designPatterns.singleton1.withEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.designPatterns.singleton1.User;

public class Application {

	private final List<User> users;
	
	public Application() {
		users = new ArrayList<>();
		
	}
	
	public void addUser(User user) {
		Database db = Database.INSTANCE;
		user.setDescription("{last login : "+db.getCurrentTime() + "}");
		users.add(user);
	}
	
	public String getLogs() {
		return Arrays.toString(users.toArray());
	}
}
