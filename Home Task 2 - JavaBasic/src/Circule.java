
public class Circule {
	
	int x;
	int y;
	int radius;
	
	public Circule(int x, int y, int radius) {
		this.x =  x;
		this.y = y;
		this.radius = radius;
	}
	
	public double [][] getCircule (int a , int b, int radius) {
		
		double [][] circule = new double [2][radius *4 ];
		double y = 0;
			

		for (int x = 0; x < radius ; x++ ) {

			y =  Math.sqrt( (radius * radius) - (x * x) ); 

			circule[0][x] = x + a;
			circule[1][x] = y + b;
			circule[0][x + radius  ] = x + a;
			circule[1][x + radius] = -(y + b);

			circule[0][x + 2*radius] = -(x + a);
			circule[1][x + 2*radius] = y + b;
			circule[0][x + 3*radius] = -(x + a);
			circule[1][x + 3*radius] = -(y + b);



		}
		
		return circule;
		
	}

	public void compareCircules (double[][] firstCircule, double[][] secondCircule ) {
		boolean result = false;
		for (int i = 0; i < firstCircule.length ; i++ ) {
			for (int j =0; j < firstCircule[i].length ; j++ ) {
				for (int k = 0; k < secondCircule.length ; k++ ) {
					for (int l = 0; l < secondCircule[k].length  ;l++ ) {

						if (firstCircule[0][j] == secondCircule[0][l] &&
								firstCircule[1][j] == secondCircule[1][l]) {
							System.out.printf("%f  %f;", firstCircule[0][j], firstCircule[1][j] );
							System.out.println();
						} else {
							System.out.println("No coincedense");
						}
					}
				}
			}
		}
		//return result;
	}
	

	public static void main(String[] args) {
		Circule circule = new Circule(0, 0, 4);
		Circule circule2 = new Circule(8,0, 4);
		double [][] array = circule.getCircule(circule.x, circule.y, circule.radius);
		double [][] array2 = circule2.getCircule(circule2.x, circule2.y, circule2.radius);

		//int count = 0;
//		for (int j = 0; j < array2[0].length; j++) {
//			System.out.println();
//			int i = 0;
//		
//			for ( i = 0;  i < array2.length; i++) {
//				
//			
//			System.out.printf("%f   ",  array2[i][j]);
//			}
//		}
		circule.compareCircules( array,array2);
		
	

    }
}
