package com.example.springboot_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_restapi.model.Proyek;

@Repository
public interface proyekrepository extends JpaRepository<Proyek, Long>{
}