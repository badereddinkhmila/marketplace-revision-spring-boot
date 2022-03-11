package com.ecommerce.marketplace.Repository;

import com.ecommerce.marketplace.Entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long orderId);

    Optional<User> findByCreatedBy(Long userId, Pageable pageable);

    long countByCreatedBy(Long userId);
}
