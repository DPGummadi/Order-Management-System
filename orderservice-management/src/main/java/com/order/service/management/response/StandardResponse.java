package com.order.service.management.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author ignatius. (5D21958E)
 *
 * @param <R>
 */
@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder({ "success", "data", "result" })
public class StandardResponse<R> extends BasicResponse
{

	
	private static final long serialVersionUID = 10000000000000005L;
	
	private R data;


	public R getData()
	{
		return data;
	}


	public void setData(R data)
	{
		this.data = data;
	}

}

