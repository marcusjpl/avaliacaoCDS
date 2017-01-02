package com.cds.dao.service;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cds.dao.ItemsDao;
import com.cds.model.Item;


@Component
@Transactional
public class ItemService extends EntityService<Item> implements ItemsDao {

	
}

