package com.codeclan.example.BookingSystem.repository;

import com.codeclan.example.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(Integer rating);

    List<Course> findByBookingsCustomerName(String name);

}
