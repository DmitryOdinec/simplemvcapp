package com.java.odinec.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "/add_new_order", method = RequestMethod.POST)
	public String addNewOrder(@RequestParam(value="title") String title, 
							  @RequestParam(value="price") Double price) {
		Order order = new Order();
		order.setTitle(title);
		order.setPrice(price);
		orderService.save(order);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteItem(@PathVariable Integer id) {
		Order order = orderService.getById(id);
		orderService.delete(order);
		return "redirect:/";
	}
}
