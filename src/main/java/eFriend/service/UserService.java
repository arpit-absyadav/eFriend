package eFriend.service;

import eFriends.model.Login;
import eFriends.model.User;

public interface UserService {

	  void register(User user);

	  User validateUser(Login login);
}
