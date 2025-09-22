package kr.ac.kopo.su.demojdbctest.repository;

import kr.ac.kopo.su.demojdbctest.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer>
{

}
