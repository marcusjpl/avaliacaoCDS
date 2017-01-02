package com.cds.dao.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cds.dao.OrdersDao;
import com.cds.model.Order;

@Component
@Transactional
public class OrderService extends EntityService<Order> implements OrdersDao {

}
