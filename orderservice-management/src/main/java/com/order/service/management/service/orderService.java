package com.order.service.management.service;

import java.util.List;

import com.order.service.management.dto.OrderDto;
import com.order.service.management.dto.StatusVo;

public interface orderService {
	
	StatusVo saveOrder(OrderDto orderDto);
	List<OrderDto> orders();

}
