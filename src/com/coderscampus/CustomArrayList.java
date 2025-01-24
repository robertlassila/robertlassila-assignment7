package com.coderscampus;


import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int size = 0;
	
	@Override
	public boolean add(T item) {
		return add(size, item);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		resizeArray();
	
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
		}
		for (int i = size - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}
		
		items[index] = item;
		size++;
		return true;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		
		checkForOutOfBounds(index);
		
		return (T) items[index];
	}


	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		checkForOutOfBounds(index);
		T removedItem = (T) items[index];
		
		for (int i = index; i < size-1; i++) {
			items[i] = items[i  +  1];
		}
		items[size-1] = null;
		size--;
		return removedItem;
	}
	
	private void resizeArray() {
		if (size >= items.length) { 
			items = Arrays.copyOf(items, items.length * 2);
		}
	}
	
	private void checkForOutOfBounds(int index) {
		if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
	    }
	}
}
