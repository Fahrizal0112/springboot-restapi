package com.example.springboot_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_restapi.model.lokasi;

@Repository
public interface lokasirepository extends JpaRepository<lokasi, Long>{
} 
