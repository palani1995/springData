package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
