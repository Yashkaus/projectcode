package com.example.project.Resp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Entity.UserEntity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
