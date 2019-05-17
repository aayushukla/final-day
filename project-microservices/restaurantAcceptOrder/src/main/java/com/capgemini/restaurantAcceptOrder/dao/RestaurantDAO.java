package com.capgemini.restaurantAcceptOrder.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.restaurantAcceptOrder.entity.RestaurantAccept;


@Repository
public interface RestaurantDAO extends MongoRepository<RestaurantAccept, Integer> {

}
