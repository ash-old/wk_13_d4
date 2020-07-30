package com.codeclan.example.BookingSystem.repository;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseNameIgnoreCase(String course);

    List<Customer> findByTownAndBookingsCourseNameIgnoreCase(String town, String course);

    List<Customer> findByAgeGreaterThanAndTownAndBookingsCourseNameIgnoreCase(Integer age, String town, String course);



}
