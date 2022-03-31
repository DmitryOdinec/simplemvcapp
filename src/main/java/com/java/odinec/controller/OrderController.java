package com.java.odinec.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.odinec.domain.Order;
import com.java.odinec.service.OrderService;
import com.java.odinec.service.OrderServiceImpl;

@Controller
public class OrderController {

	private OrderService orderService = new OrderServiceImpl();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getOrderPage(Model model) {
		List<Order> orders = orderService.getAll();
		model.addAttribute("orderList", orders);
		return "order";
	}
	
	@RequestMapping(value = "/add_new_order", method = RequestMethod.GET)
	public String addNewOrderPage() {
		return "addNewOrder";
	}
}
