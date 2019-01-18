package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Phone;

public interface PhoneRepo extends JpaRepository<Phone, Integer> {

}
