package com.jda.jira.Examples.Inventory.items.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jda.jira.Examples.Inventory.items.entity.Items;
import com.jda.jira.Examples.Inventory.items.entity.keys.ItemsId;
import com.jda.jira.Examples.Inventory.items.repository.ItemsRepository;

@RestController
@RequestMapping("/api/v1")
public class ItemController {

	@Autowired
	ItemsRepository itemsRepository;
	
	 @GetMapping("/items")
	 public List<Items> getItems()  
	   throws Exception {
	  List<Items> items = itemsRepository.findAll();
	  return items;
	 }
	
	 @GetMapping("/items/{prtNum}")
	 public List<Items> getItemsBYPrtNUm(@PathVariable(value = "prtNum") String prtNum)
	   throws Exception {
	  System.out.print("Part number is "+prtNum);
	  ItemsId id = new ItemsId();
	  id.setPrtnum(prtNum);
	  List<Items> items = itemsRepository.findById(id);
	  return items;
	  
	 }
	 
}
