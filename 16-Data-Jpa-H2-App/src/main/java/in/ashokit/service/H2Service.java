package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Test;
import in.ashokit.repo.H2Repo;

@Service
public class H2Service {

	@Autowired
	public H2Repo h2Repo;

	public H2Service(H2Repo h2Repo) {
		this.h2Repo = h2Repo;
	}
	public void saveTest() {
		Test t = new Test();
		t.setAge(20);
		t.setName("rakesh");
		h2Repo.save(t);
	}
}
