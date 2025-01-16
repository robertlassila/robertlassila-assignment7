package com.coderscampus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(10);
		
		assertEquals(1, customList.getSize());
		assertEquals(10, customList.get(0));
	}
	@Test
	void should_add_one_item_at_already_existing_index() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			customList.add(i);
		}
		
		customList.add(1, 2);
		
		Integer expectedSize = customList.getSize();
		Integer expectedResult = customList.get(1);
		
		assertEquals(expectedSize, 11);
		assertEquals(expectedResult, 2);
	}
	@Test
	void should_remove_one_item_at_already_existing_index() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			customList.add(i);
		}
		
		Integer removedItem = customList.remove(12);
		Integer expectedSize = customList.getSize();
		Integer expectedResult = customList.get(13);
		
		
		assertEquals(expectedSize, 15);
		assertEquals(expectedResult, 14);
		assertEquals(removedItem, 12);
	}
	
	

}
