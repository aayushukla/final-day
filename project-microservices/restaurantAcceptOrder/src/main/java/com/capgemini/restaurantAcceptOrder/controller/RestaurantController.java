package com.capgemini.restaurantAcceptOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.restaurantAcceptOrder.entity.RestaurantAccept;
import com.capgemini.restaurantAcceptOrder.service.RestaurantService;



@RestController
@CrossOrigin("*")
public class RestaurantController {

	
	@Autowired
	private RestaurantService service;

	@PostMapping("/accept")
	public ResponseEntity<RestaurantAccept> signupDetailsofRestaurant(@RequestBody RestaurantAccept order) {
		System.out.println(order);
		
		RestaurantAccept r = service.acceptOrder(order);
		System.out.println(r);

		return new ResponseEntity<RestaurantAccept>(r, HttpStatus.CREATED);

	}
}
