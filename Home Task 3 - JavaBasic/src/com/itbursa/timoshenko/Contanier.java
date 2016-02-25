package com.itbursa.timoshenko;

public class Contanier {
	// 2 - dimension array for x, y ordinates
	int[][] contanier ;

	public Contanier(int[][] data) {
		this.contanier = data;
	}

	// moving ordinates on explicit value kx, ky
	public void moveXY(int[][] data, int kx, int ky) {
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (i == 0) {
					this.contanier[i][j] += kx;
					continue;
				}
				this.contanier[i][j] += ky;

			}
		}

		
	}

	public void scalingXY( int k) {
		

		for (int i = 0; i < this.contanier.length; i++) {
			for (int j = 0; j < this.contanier[i].length; j++) {
				this.contanier[i][j] *=  k;

			}
		}

	}

}
