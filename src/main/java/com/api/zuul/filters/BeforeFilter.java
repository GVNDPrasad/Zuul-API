package com.api.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

//PRE-Filter
@Component
public class BeforeFilter extends ZuulFilter{
  
	
	private static final Logger log = LoggerFactory.getLogger(BeforeFilter.class);

	
	public boolean shouldFilter() {
		return true;
	}

	
	public Object run() throws ZuulException {
		// logic
		log.info("BeforeFilter :: run() ::: Entered a Pre-Filter depends on Request");
		return null;
	}

	
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	
	public int filterOrder() {
		return 0;
	}

}
