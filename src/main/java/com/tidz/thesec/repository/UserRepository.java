package com.tidz.thesec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tidz.thesec.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
