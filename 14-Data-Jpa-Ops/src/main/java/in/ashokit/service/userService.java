package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.userRepo;

@Service
public class userService {

	public userRepo user_repo;
	
	userService(userRepo user_repo){
		this.user_repo= user_repo;
	}
	//custom update queries
	public void updateUserHql() {
		user_repo.updateUserHql();
	}
	public void updateUseSql() {
		user_repo.updateuserSql();
	}
	//custom retriving queries
	public void getAllUsersHql() {
		List<User> Hql = user_repo.getAllUsersHql();
		Hql.forEach(System.out::println);
	}
	public void getAllUsersSql() {
		List<User> Sql = user_repo.getAllUsersSql();
		Sql.forEach(System.out::println);
	}
	//custom delete queries
	public void deleteUserHql() {
		user_repo.deleteUserHql();
	}
	public void deleteUserSql() {
		user_repo.deleteUserSql();
	}
	//findby methods
	public void findByCountry(String country){
		List<User> byCountry = user_repo.findByCountry(country);
		byCountry.forEach(System.out::println);
//		byCountry.forEach(s->{
//			System.out.println(s);
//		});
	}
	public void findByCountryAndId(String country, Integer Id) {
		List<User> byCountryAndId = user_repo.findByCountryAndId(country, Id);
		byCountryAndId.forEach(System.out::println);
	}
	//pre-defined methods
	public void deleteById() {
		user_repo.deleteById(100);
	}
	public void deleteAll() {
		user_repo.deleteAll();
	}
	public void findAllUser() {
		Iterable<User> all = user_repo.findAll();
//		all.forEach(a->{
//			System.out.println(a);
//		});
		for(User u : all) {
			System.out.println(u);
		}
	}
	public void getCount() {
		 long count = user_repo.count();
	}
	public void saveUser() {
		User u = new User();
		u.setId(109);
		u.setName("vin Diesel");
		u.setCountry("UK");
		u.setGender("male");
		
		User u1 = new User();
		u1.setId(108);
		u1.setName("Anna Hathaway");
		u1.setCountry("Australia");
		u1.setGender("Female");
		User u2 = new User();
		u2.setId(107);
		u2.setName("Amber head");
		u2.setCountry("New Zealand");
		u2.setGender("female");
		User u3 = new User();
		u3.setId(106);
		u3.setName("Naomi Scott");
		u3.setCountry("Canada");
		u3.setGender("female");
		List<User> List = Arrays.asList(u,u1,u2,u3);
		user_repo.saveAll(List);
		
	}
}
