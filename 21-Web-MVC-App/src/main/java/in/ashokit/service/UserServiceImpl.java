package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser.getUid() != null;
	}

	@Override
	public User editUser(Integer uid) {
		Optional<User> byId = userRepo.findById(uid);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public boolean deleteUser(Integer uid) {
		if(userRepo.existsById(uid)) {
			userRepo.deleteById(uid);
			return true;
		}
		return false;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

}