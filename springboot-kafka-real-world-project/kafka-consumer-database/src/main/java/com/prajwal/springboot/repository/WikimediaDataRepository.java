package com.prajwal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prajwal.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
