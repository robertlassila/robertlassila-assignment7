package com.coderscampus;


import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int size = 0;
	
	@Override
	public boolean add(T item) {
		if (size >= items.length) { 
			items = Arrays.copyOf(items, (items.length * 2));
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		
	    if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
	    }
			return ((T) items[index]);

	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (size >= items.length) { 
			items = Arrays.copyOf(items, (items.length * 2));
		}
		
		if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
	    }
		
		for (int i = size; i >= index; i--) {
			items[(i + 1)] = items[i];
		}
		items[index] = item;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
	    }
		T removedItem = (T) items[index];
		items[index] = null;
		
		for (int i = index; i <= size-1; i++) {
			items[i] = items[(i+1)];
		}
		items[size] = null;
		size--;
		return removedItem;
	}
	
}
