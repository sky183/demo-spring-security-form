package me.whiteship.demospringsecurityform.account;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 이 인터페이스만 만들어도 빈으로 등록되고 사용 가능
 * DAO 없이 DB에서 CRUD를 다 해준다.
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);
}
