package in.ashokit.entity;

import org.springframework.data.redis.core.RedisHash;


@RedisHash("studentHash")
public class Student {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String name;
	public Integer id;
}
