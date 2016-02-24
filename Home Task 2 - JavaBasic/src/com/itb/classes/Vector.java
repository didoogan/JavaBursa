package com.itb.classes;

public class Vector {
	
	
	private static final int DEFAULT_SIZE = 10;

	private Object[] objects;
	private int size;
	private  int counter = 0;

	/**
	 * Creates a new instance of Vector with default size (default size = 10).
	 */
	public Vector() {
		this.size = Vector.DEFAULT_SIZE;
		this.objects = new Object [this.size];
		
	}

	/**
	 * Creates a new instance of Vector with a specified size.
	 */
	public Vector(int size) {
		
		this.objects = new Object [size];
	}

	/**
	 * Appends the specified element to the end of this vector
	 * 
	 * @param element
	 *            - element to be appended to this vector
	 */
	public void add(Object element) {
		if (this.counter > this.size) {
			 Object [] array = new Object[this.size + 10];
			
			 for (int i = 0; i < this.size; i++) {
				array[i] = this.objects[i];
				
			}
			this.objects = array.clone();
			
		} 
		this.objects[this.counter] = element;
		this.counter ++;
		
	}

	/**
	 * Returns the element at the specified position in this vector.
	 * 
	 * @param index
	 *            - index of the element to return
	 * @return the element at the specified position in this vector
	 */
	public Object get(int index) {
		
		return this.objects[index];
	}

	/**
	 * Removes the element at the specified position in this vector. Shifts any
	 * subsequent elements to the left.
	 * 
	 * @param index
	 *            - the index of the element to be removed
	 */
	public void remove(int index) {
		for (int i = index; i < this.objects.length -1; i++) {
			this.objects[i] = this.objects[i +1];
		}
		this.objects[this.size] = null;
		this.size --;
		this.counter --;
	}

	/**
	 * Removes all of the elements from this vector.
	 */
	public void clear() {
		for (int i = 0; i < this.objects.length; i++) {
			this.objects = null;
		}
		
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < this.counter; i ++) {
			output += String.format(" The %d-th element contain %s  ", 
					this.objects[i], this.objects[i].toString() );
		}
		return output;
		
	}
}