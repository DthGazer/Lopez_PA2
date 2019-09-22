import java.util.Scanner;

public class Lopez_PA1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		//variables
		int userNum1;
		int userNum2;
		int userNum3;
		int userNum4;
		//array
		int[] encrypt = new int[4];
		
		/*user input each digit to be a four digit
		integer
		*/
		userNum1 = scnr.nextInt();
		userNum2 = scnr.nextInt();
		userNum3 = scnr.nextInt();
		userNum4 = scnr.nextInt();
		//add 7 and divide by 10 on each digit
		encrypt[0] = (userNum1 + 7) / 10;
		encrypt[1] = (userNum2 + 7) / 10;
		encrypt[2] = (userNum3 + 7) / 10;
		encrypt[3] = (userNum4 + 7) / 10;
		/*switches first with third and 
		switches second with fourth*/
		encrypt[0] = encrypt[2];
		encrypt[1] = encrypt[3];
		/*outputs each digit to create the new four
		 digit integer
		 */
		System.out.print(encrypt[0]);
		System.out.print(encrypt[1]);
		System.out.print(encrypt[2]);
		System.out.print(encrypt[3]);
	}

}
