package com.capgemini.restaurantAcceptOrder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.restaurantAcceptOrder.dao.RestaurantDAO;
import com.capgemini.restaurantAcceptOrder.entity.RestaurantAccept;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	public RestaurantDAO DAO;
	
	@Override
	public RestaurantAccept acceptOrder(RestaurantAccept data) {

		return DAO.insert(data);
		
	}
}
