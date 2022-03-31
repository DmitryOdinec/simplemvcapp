package com.java.odinec.repository;

import java.util.List;

import com.java.odinec.domain.Order;

public interface OrderRepository {

	void save(Order order);
	void delete(Order order);
	List<Order> getAll();
	Order getById(Integer id);
}
