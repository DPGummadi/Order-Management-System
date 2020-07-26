package com.order.service.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.order.service.management.dto.OrderDto;
import com.order.service.management.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
   
	
	@Query(value="select new com.order.service.management.dto.OrderDto(order.orderId,order.customerName,order.orderDate,order.shippingAddress,order.total)"
			+ " from Order order")
	List<OrderDto> Orders();
}
