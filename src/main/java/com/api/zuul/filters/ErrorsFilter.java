package com.api.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

//Error Filter
@Component
public class ErrorsFilter extends ZuulFilter {

	
	private static final Logger log = LoggerFactory.getLogger(ErrorsFilter.class);

	public boolean shouldFilter() {
		return true;
	}

	
	public Object run() throws ZuulException {
		//logic Code
		log.info("RouteFilter :: run() ::: Entered a Route-Filter depends on Eureka after");
		return null;
	}

	
	public String filterType() {
		return FilterConstants.ERROR_TYPE;
	}

	
	public int filterOrder() {
		return 0;
	}

}
