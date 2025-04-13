package com.example.miniapp.repositories;

import com.example.miniapp.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Find customers whose email ends with a specific domain
    List<Customer> findByEmailEndingWith(String domain);

    // Find customers whose phone number starts with a specific prefix
    List<Customer> findByPhoneNumberStartingWith(String prefix);
}
