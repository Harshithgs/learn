package com.example.Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Learning.dto.Leo;

public interface LeoReposistory extends JpaRepository<Leo, Integer> {

}
