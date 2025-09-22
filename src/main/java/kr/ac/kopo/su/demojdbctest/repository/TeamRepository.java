package kr.ac.kopo.su.demojdbctest.repository;

import kr.ac.kopo.su.demojdbctest.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer>
{

}
