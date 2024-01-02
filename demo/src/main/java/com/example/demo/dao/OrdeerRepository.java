package com.example.demo.dao;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Ordeer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface OrdeerRepository extends JpaRepository<Ordeer, Integer> {
    List<Ordeer> findByCreateDateAfter(LocalDateTime createDate);
    List<Long> findOrderIdsByCustomerNameContainingIgnoreCase(String keyword);

    @Query("SELECT DISTINCT o.customer FROM Order o WHERE o.customer.id NOT IN :customerIdsWithOrders")
    List<Customer> findCustomersWithoutOrders(List<Long> customerIdsWithOrders);
}
