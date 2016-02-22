package com.itb.classes;

public class Matrix {

	private double[][] matrix;
	private int rows;
	private int columns;

	/**
	 * Creates a new instance of Matrix rows-by-columns of 0's
	 * 
	 * @param rows
	 *            -number of rows
	 * @param columns
	 *            - number of columns
	 */
	public Matrix(int rows, int columns) {

		this.rows = rows;
		this.columns = columns;
	}

	/**
	 * Creates a new instance of Matrix based on 2d array
	 * 
	 * @param data
	 *            - data to fill the matrix
	 */
	public Matrix(double[][] data) {

		this.matrix = data;
	}

	/**
	 * Returns the result of adding specified matrix to this matrix
	 * 
	 * @param matrix
	 * @return
	 */
	public Matrix plus(Matrix matrix) {

		Matrix result = null;

		if (matrix.rows == this.rows && matrix.columns == this.columns) {

			double[][] date = new double[matrix.rows][matrix.columns];
			result = new Matrix(date);

			for (int i = 0; i < matrix.rows; i++) {
				for (int j = 0; j < matrix.columns; j++) {
					result.matrix[i][j] = matrix.matrix[i][j] + this.matrix[i][j];
				}
			}
		}
		return result;
	}

	/**
	 * Returns the result of multiplying this matrix by specified number
	 */
	public Matrix times(double number) {

		double[][] date = new double[this.rows][this.columns];
		Matrix result = new Matrix (date);

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				result.matrix[i][j] = this.matrix[i][j] * number;
			}
		}
		return result;
	}

	/**
	 * Returns the result of multiplying this matrix by specified matrix
	 */
	public Matrix times(Matrix matrix) {
		int rows = matrix.rows;
		int columns = matrix.columns;
						
		double [][] date = new double [rows][columns];
		Matrix result = new Matrix (date);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0;  k < rows ; k++) {
					result.matrix[i][j] += this.matrix[i][k] * matrix.matrix[k][i];
				}
				
			}
		}
		return result;
	}

	/**
	 * Transposes (turn all the rows of a given matrix into columns and
	 * vice-versa) this matrix
	 * 
	 * @return transpose of the invoking matrix
	 */
	public Matrix transpose() {
		int rows = this.columns;
		int columns = this.rows;
		double [][] date = new double [rows][columns];
		Matrix result = new Matrix (date);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result.matrix[i][j] = this.matrix[j][i];
			}
			
		}
		
		return this;
	}

	/**
	 * Prints matrix to the "standard" output stream.
	 */
	public void print() {
		for (int i = 0; i < this.rows; i++) {
			System.out.println();
			for (int j = 0; j < this.columns; j++) {
				System.out.println(this.matrix[i][j] + " ");
				
			}
		}
	}
}