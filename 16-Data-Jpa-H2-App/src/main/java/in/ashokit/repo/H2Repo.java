package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Test;

public interface H2Repo extends JpaRepository<Test,Integer> {

}
