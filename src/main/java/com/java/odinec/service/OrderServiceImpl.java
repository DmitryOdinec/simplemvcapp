package com.java.odinec.service;

import java.util.List;

import com.java.odinec.domain.Order;
import com.java.odinec.repository.OrderRepository;
import com.java.odinec.repository.OrderRepositoryImpl;

public class OrderServiceImpl implements OrderService{

	OrderRepository orderRepository = new OrderRepositoryImpl();
	
	public void save(Order order) {
		if(order != null) {
			List<Order> ordersRepo = orderRepository.getAll();
			if(!ordersRepo.isEmpty()) {
				Order orderLast = ordersRepo.get(ordersRepo.size() - 1);
				order.setId(orderLast.getId() + 1);
				orderRepository.save(order);
			}
		}
	}
	public void delete(Order order) {
		if(order != null) {
			orderRepository.delete(order);
		}
	}
	public List<Order> getAll() {
		return orderRepository.getAll();
	}
	public Order getById(Integer id) {
		if(id != null) {
			return orderRepository.getById(id);
		}
		return null;
	}
}
