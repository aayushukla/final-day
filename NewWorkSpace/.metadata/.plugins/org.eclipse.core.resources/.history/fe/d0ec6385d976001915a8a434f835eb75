package com.capgemini.foodApp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.foodApp.dao.RestaurantDao;
import com.capgemini.foodApp.restaurant.RestaurantInfo;

import com.capgemini.foodApp.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDao rdao;
	
	@Override
	public RestaurantInfo addDetails(RestaurantInfo restaurant) {
		// TODO Auto-generated method stub
		return rdao.insert(restaurant);
	}

	@Override
	public RestaurantInfo findByEmail(String email) {
		// TODO Auto-generated method stub
		return rdao.findByEmail(email);
	}

	
	

}
