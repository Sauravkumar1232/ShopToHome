package com.greatlearning.shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.greatlearning.shopforhome.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
