package com.codeclan.example.BookingSystem.components;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repository.BookingRepository;
import com.codeclan.example.BookingSystem.repository.CourseRepository;
import com.codeclan.example.BookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Bobby", "small town", 23);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("John", "middle town", 30);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Sandra", "large town", 25);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Peter", "large town", 27);
        customerRepository.save(customer4);
        Customer customer5 = new Customer("Pedro", "large town", 20);
        customerRepository.save(customer5);



        Course course1 = new Course("Accounting", "near-by town", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Software Development", "not-so-near-by town", 3);
        courseRepository.save(course2);
        Course course3 = new Course("Gardening", "far away town", 1);
        courseRepository.save(course3);

        Booking booking1 = new Booking("01-02-20", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("30-07-21", course2, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("05-10-20", course3, customer3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("01-02-20", course1, customer2);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("01-02-20", course3, customer4);
        bookingRepository.save(booking5);
        Booking booking6 = new Booking("01-02-20", course3, customer5);
        bookingRepository.save(booking6);






    }
}
