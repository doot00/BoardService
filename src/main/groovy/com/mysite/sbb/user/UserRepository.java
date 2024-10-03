package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername (String username); // 사용자 ID를 조회하는 기능이 필요하므로 다음과 같이 사용자 ID SiteUser엔티티를 조회하는 findByUsername 메서드를 리포지터리에 추가
}
