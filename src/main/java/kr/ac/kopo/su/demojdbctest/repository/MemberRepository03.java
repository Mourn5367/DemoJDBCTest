package kr.ac.kopo.su.demojdbctest.repository;

import kr.ac.kopo.su.demojdbctest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


// <Member, Integer> Integer는 PK 자료형
public interface MemberRepository03 extends JpaRepository<Member, Integer>
{
    @Transactional
    @Query(value = "select entity from Member entity")
    public List<Member> selectMethod();

}
