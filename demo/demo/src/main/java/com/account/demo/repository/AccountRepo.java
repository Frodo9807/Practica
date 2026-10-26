package com.account.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.account.demo.entity.Account;
import org.springframework.stereotype.Repository;

@Repository 
public interface AccountRepo extends JpaRepository<Account, Long> {
    
}
