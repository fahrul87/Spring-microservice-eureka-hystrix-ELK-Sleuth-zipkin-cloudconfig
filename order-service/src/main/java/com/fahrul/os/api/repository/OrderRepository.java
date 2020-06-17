package com.fahrul.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
