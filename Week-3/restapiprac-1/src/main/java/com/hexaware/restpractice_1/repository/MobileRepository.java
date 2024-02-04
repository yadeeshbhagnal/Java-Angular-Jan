package com.hexaware.restpractice_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restpractice_1.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
