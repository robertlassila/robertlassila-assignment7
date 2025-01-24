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
		
		assertEquals(12, expectedSize);
		assertEquals(2, expectedResult);
	}
	@Test
	void should_add_one_item_at_end_of_list() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			customList.add(i);
		}
		
		Integer initialSize = customList.getSize();
		
		customList.add(11, 2);
		
		Integer newExpectedSize = customList.getSize();
		Integer expectedResult = customList.get(11);
		
		assertEquals(11, initialSize);
		assertEquals(12, newExpectedSize);
		assertEquals(2, expectedResult);
	}
	@Test
	void should_remove_one_item_at_already_existing_index() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			customList.add(i);
		}
		
		Integer initialSize = customList.getSize();
		
		
		Integer removedItem = customList.remove(12);
		Integer newExpectedSize = customList.getSize();
		Integer expectedResult = customList.get(13);
		
		
		assertEquals(16, initialSize);
		assertEquals(15, newExpectedSize);
		assertEquals(14, expectedResult);
		assertEquals(12, removedItem);
	}

	@Test
	void should_remove_one_item_at_the_end_of_the_list() {

		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			customList.add(i);
		}
			Integer initialSize = customList.getSize();
			
			
			Integer removedItem = customList.remove(15);
			Integer newExpectedSize = customList.getSize();
			Integer expectedResult = customList.get(14);
			
			
			
			assertEquals(16, initialSize);
			assertEquals(15, newExpectedSize);
			assertEquals(14, expectedResult);
			assertEquals(15, removedItem);
			
		
	}
	@Test
	void should_remove_one_item_at_the_start_of_the_list() {

		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			customList.add(i);
		}
			Integer initialSize = customList.getSize();
			
			
			Integer removedItem = customList.remove(0);
			Integer newExpectedSize = customList.getSize();
			Integer expectedResult = customList.get(14);
			
			
			assertEquals(16, initialSize);
			assertEquals(15, newExpectedSize);;
			assertEquals(15, expectedResult);
			assertEquals(0, removedItem);
		
	}
	
	@Test
	void should_give_exception() {
		 
		 CustomList<Integer> customList = new CustomArrayList<>();
	        
		 assertThrows(IndexOutOfBoundsException.class, () -> {
	            customList.get(1);
	        });
		 
		 assertThrows(IndexOutOfBoundsException.class, () -> {
	            customList.remove(1);
	        });
	   }
	
	@Test
	void should_give_exception_handling_null_value() {
		 
		 CustomList<Integer> customList = new CustomArrayList<>();
	        
		 for (int i = 0; i <= 15; i++) {
				customList.add(i);
			}
				
				customList.remove(15);
			
		 assertThrows(IndexOutOfBoundsException.class, () -> {
	            customList.get(15);
	        });
		 
	   }
	
	@Test
	void should_add_item_at_index_zero_of_empty_list() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(0, 35);
		
		Integer addedItem = customList.get(0);
		
		assertEquals(35, addedItem);
	}
	
	@Test
	void should_add_item_at_beginning_of_already_populated_list() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			customList.add(i);
		}
		
		customList.add(0, 35);
		
		Integer indexZero = customList.get(0);
		Integer indexOne = customList.get(1);
		
		assertEquals(35, indexZero);
		assertEquals(0, indexOne);
		
	}
	@Test
	void should_resize_after_adding_item_at_specific_index() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i <= 13; i++) {
			customList.add(i);
		}
		
		Integer sizeBeforeAdd = customList.getSize();
		
		customList.add(8, 567);
		
		Integer newSize = customList.getSize();
		
		assertEquals(14, sizeBeforeAdd);
		assertEquals(15, newSize);
	}
	
	

}
