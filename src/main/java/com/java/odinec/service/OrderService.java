package com.java.odinec.service;

import java.util.List;

import com.java.odinec.domain.Order;

public interface OrderService {

	void save(Order order);
	void delete(Order order);
	List<Order> getAll();
	Order getById(Integer id);
}
