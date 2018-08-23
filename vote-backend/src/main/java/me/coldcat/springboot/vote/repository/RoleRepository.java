package me.coldcat.springboot.vote.repository;

import me.coldcat.springboot.vote.model.Role;
import me.coldcat.springboot.vote.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
