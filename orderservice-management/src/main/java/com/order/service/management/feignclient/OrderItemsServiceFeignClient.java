package com.order.service.management.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.order.service.management.dto.OrderItemsDto;
import com.order.service.management.response.StandardResponse;

@FeignClient(name="orderItem-management",url="localhost:8080")
public interface OrderItemsServiceFeignClient {
	
	@GetMapping("/order-items")
	public StandardResponse<List<OrderItemsDto>> OrderedItems();
}