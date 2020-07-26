package com.order.item.management.service;

import java.util.List;

import com.order.item.management.dto.OrderItemsDto;
import com.order.item.management.dto.StatusVo;

public interface OrderItemsService {
	
	List<OrderItemsDto> OrderedItems();

	StatusVo addOrderItem(OrderItemsDto orderItemsDto);

}
