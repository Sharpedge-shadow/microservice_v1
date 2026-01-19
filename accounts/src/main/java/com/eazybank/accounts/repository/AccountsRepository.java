package com.eazybank.accounts.repository;

import com.eazybank.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    //whenever update or delete data by using custom data always use the @Transactional and @Modifying
    //so if any issue happen it can rollback automatically
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
