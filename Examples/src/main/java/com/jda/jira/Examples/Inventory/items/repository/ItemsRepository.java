package com.jda.jira.Examples.Inventory.items.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.jda.jira.Examples.Inventory.items.entity.Items;
import com.jda.jira.Examples.Inventory.items.entity.keys.ItemsId;

public interface ItemsRepository extends Repository<Items, ItemsId>{
	List<Items> findAll();
	List<Items> findById(ItemsId id);
	

}
