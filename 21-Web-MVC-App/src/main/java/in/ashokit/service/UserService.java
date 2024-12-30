package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.User;

public interface UserService {

	public boolean saveUser(User user);
	public List<User> getAllUser();
	public User editUser(Integer uid);
	public boolean deleteUser(Integer uid);
}
