package com.order.item.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.order.item.management.dto.OrderItemsDto;
import com.order.item.management.entity.OrderItems;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer>{
	
	@Query(value="select new com.order.item.management.dto.OrderItemsDto(orderItems.orderItemId,orderItems.productCode,orderItems.productName,orderItems.quantity) from OrderItems orderItems ")
	 List<OrderItemsDto> getOrderedItems();
}
