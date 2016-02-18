
public class MathOperation {

	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public int getCommonDivisor(int firstNumber, int secondNumber) {

		int maxNumber;

		// Не пойму, почему если не присвою значение переменной
		// nod, то программа не работает
		int nod = 666;
		maxNumber = firstNumber;

		if (secondNumber > firstNumber) {
			maxNumber = secondNumber;
		}

		for (int i = 1; i <= maxNumber ; i++ ) {
			if ((firstNumber % i == 0) && (secondNumber % i == 0) ) {
				nod = i;			
			}
		}	
		return nod;
	}

	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int number) {
		String numberToString = Integer.toString(number );
		int sum = 0;

		for (int i = 0;i < numberToString.length() ;i++ ) {
			sum += Character.getNumericValue(numberToString.charAt(i) ); 
		}
		return sum;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return true - if number is prime, if not return false
	 */
	public boolean isPrime(int number) {
		boolean result = true  ;

		if (number == 0 || number ==1) {
			result = false;
		}

		for (int i = 2;i < number ;i++ ) {
			if (number % i == 0   ) {
				result = false;
				break;
			}
		}
		return result;
	}

	/**
	 * Returns sum of row: 1! - 2! + 3! – 4! + 5! - … + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public int factorial (int number) {
		int result = 1;
		for (int i = 1;i <= number ;i++ ) {
			result *= i;
		}
		return result;
	}

	public int getSumOfRow(int number) {
		int result = 0;
		int maxRank = 0;



		for (int i = 10;  i <= number * 10; i *= 10) {
			
			if (number / i >= 1) {
				maxRank++;
			}
		}

		int[] massiv = new int[maxRank +1]; 

		for (int i = maxRank; i >= 0; i--) {
			
			massiv[i]=  (int)(number /  Math.pow(10, i) ); 
			number = number -  (massiv[i] * (int) Math.pow(10, i) );
			result += massiv[i];
		}
		return result;
	}

	/**
	 * Подсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		int result = 0;
		
		for (int i =100;i < 1000 ;i++ ) {
			for (int j = 1;j < 1000 ;j++ ) {
				if(getSumOfRow(i) == getSumOfRow(j) ) {
					result++;
				}
			}
		}
		return result;
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int length) {
		int a = 0;
		int b = 1;
		int bufer ;
		int [] array = new int [length];

		for (int i = 0; i < length  ;i++ ) {
			array[i] = a;
			bufer = a;
			a = b;
			b = a + bufer;
		}
		
		return array;
	}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		int[] array = new int[length];
		int counter = 0;
		for (int i = 0; counter < 100 ; i++ ) {
			if (isPrime(i) ) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {

		char [][] chesBoard = new char [8][8];

		for (int i = 0; i < 8 ;i++ ) {
			for (int j = 0; j < 8 ;j++ ) {
				//chesBoard[i][j] = 'b';
				if ( (i + j) % 2 == 0 ) {
					chesBoard[i][j] = 'w';
				} 
				else {
					chesBoard[i][j] = 'b';
				} 
			}
		}

		for (int i = 0; i < 8 ;i++ ) {
			System.out.println();
			for (int j =0; j < 8 ;j++ ) {
				System.out.printf("%s ", chesBoard[i][j] );
			}
		}
	}

	/**
	 * 1.9. Создать целый шестимерный массив с двумя значениями в каждом
	 * измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3,
	 * … Сказать, сколько потребуется чисел ?
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		return 0;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		// TODO the method body
	}
	
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		
		int gdc = math.getCommonDivisor(10, 15); // 5
		// System.out.println(gdc );


		int sumOfDigits = math.getSumOfDigits(123456); // 21
		// System.out.println(sumOfDigits);

		boolean isPrime = math.isPrime(7); // true
		 /*for (int i = 1;i < 100 ;i++ ) {
		 	 if (math.isPrime(i) ) {
		 	System.out.println(i);
		 	} 
		 }*/
		 

		// isPrime = math.isPrime(10); //false
		// int factorial = math.factorial(6);
		// System.out.println(factorial );

		int sumOfRow = math.getSumOfRow(1234);
		// System.out.println(sumOfRow );

		int count = math.getSixDigitNumbersCount();
		//System.out.println(count );

		 int [] fibbonacci = math.getFibonacciSeries(20); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		 /*for (int i =0 ;i < fibbonacci.length ;i++ ) {
		 	System.out.println(fibbonacci[i] );
		 }*/

		int [] primes = math.getPrimeSeries(100); // 1, 3, 5, 7, 11
		for (int i =0; i < primes.length ;i++ ) {
			System.out.println(primes[i]);
		}

		//math.printChessboard();
		// int numbersCount = math.createSixDimensionArray();
		// math.printPascalsTriangle(3);
	}
}
