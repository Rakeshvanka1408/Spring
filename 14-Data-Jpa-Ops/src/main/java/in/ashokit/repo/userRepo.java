package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;
import jakarta.transaction.Transactional;

public interface userRepo extends CrudRepository<User,Integer>  {
	@Query("From User")
	public List<User> getAllUsersHql();
	@Query(value="select * from user_info",nativeQuery=true)
	public List<User> getAllUsersSql();
	
	@Query("update User set Id=111 where Id=100")
	@Transactional
	@Modifying
	public void updateUserHql();
	@Modifying
	@Transactional
	@Query(value="update user_info set country='Japan' where country ='Canada'",nativeQuery=true)
	public void updateuserSql();
	public List<User> findByCountry(String country);
	public List<User> findByCountryAndId(String country,Integer Id);
	
	@Modifying
	@Transactional
	@Query("Delete User where Id=100")
	public void deleteUserHql();
	@Modifying
	@Transactional
	@Query(value="Delete from user_info where user_id=102" ,nativeQuery=true)
	public void deleteUserSql();
}
