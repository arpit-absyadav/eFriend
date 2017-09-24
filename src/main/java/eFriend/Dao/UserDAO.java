package eFriend.Dao;

import eFriends.model.Login;
import eFriends.model.User;

public interface UserDAO {
	void register(User user);
	User validateUser(Login login);
}
