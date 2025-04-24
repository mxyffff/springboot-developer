package me.shinsunyoung.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// member라는 이름의 테이블에 접근해서 Member 클래스에 매핑하는 구현체
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);
}
