package dao;

import java.util.List;

import domain.User;
import domain.EnumerationValue;

public interface IUserRepository 
	extends IRepository<User>
	{

	public List<User> withLogin(String login);
	public List<User> withLoginAndPassword(String login, String password);
	public List<User> setupPermissions(User user);
}