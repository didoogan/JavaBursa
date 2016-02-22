package com.itb.classes;

public class Vector {
	
	
	private static final int DEFAULT_SIZE = 10;

	private Object[] objects;
	private int size;

	/**
	 * Creates a new instance of Vector with default size (default size = 10).
	 */
	public Vector() {
		new Vector();
		this.size = Vector.DEFAULT_SIZE;
		
	}

	/**
	 * Creates a new instance of Vector with a specified size.
	 */
	public Vector(int size) {
		new Vector();
		this.size = size;
	}

	/**
	 * Appends the specified element to the end of this vector
	 * 
	 * @param element
	 *            - element to be appended to this vector
	 */
	public void add(Object element) {
		this.objects[objects.length] = element;
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
		this.objects[index] = null;
	}

	/**
	 * Removes all of the elements from this vector.
	 */
	public void clear() {
		for( Object object : this.objects) {
			object = null;
		}
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < this.objects.length; i ++) {
			output += String.format(" The %d-th element contain %s  ", 
					this.objects[i], this.objects[i].toString() );
		}
		return output;
		
	}
}