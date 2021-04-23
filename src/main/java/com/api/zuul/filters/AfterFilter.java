package com.api.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

//Post Filter
@Component
public class AfterFilter extends ZuulFilter{

	
	private static final Logger log = LoggerFactory.getLogger(AfterFilter.class);

	
	public boolean shouldFilter() {
		return true;
	}

	
	public Object run() throws ZuulException {
		//Logic code
		log.info("AfterFilter :: run() ::: Entered a Post-Filter depends on response");
		return null;
	}

	
	public String filterType() {
		return FilterConstants.POST_TYPE;
	}

	
	public int filterOrder() {
		return 0;
	}

}
