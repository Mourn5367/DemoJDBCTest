package kr.ac.kopo.su.demojdbctest.repository;

import kr.ac.kopo.su.demojdbctest.domain.Detail;
import kr.ac.kopo.su.demojdbctest.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer>
{
    
}
