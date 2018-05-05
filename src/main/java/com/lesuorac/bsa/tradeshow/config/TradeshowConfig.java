package com.lesuorac.bsa.tradeshow.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "bsa")
public class TradeshowConfig {

	private Map<String, List<String>> views = new HashMap<>();

	public Map<String, List<String>> getViews() {
		return views;
	}

	public void setViews(Map<String, List<String>> views) {
		this.views = views;
	}
	
	
}
