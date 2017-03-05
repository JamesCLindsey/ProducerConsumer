/*
 *  This Producer/Consumer Implementation was created by James Lindsey
 *  on October 2, 2016 for COP4610 (Operating Systems)
 *  for Professor Ahuja.
 *  
 * Inputs: The number of producers(1 or 2) and the number of consumers(1 or 2)
 * Outputs: The process of the producers producing and the consumers consuming.
 * 			
 */

import java.util.Scanner;

public class ProCon{
	public static void main (String[] args){
		Array plate = new Array();
		
		Producer p1 = new Producer(plate, 1);
		Producer p2 = new Producer(plate, 2);
		Consumer c1 = new Consumer(plate, 1);
		Consumer c2 = new Consumer(plate, 2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The Producer/Consumer program accepts:");
		System.out.println("1P:1C , 1P:2C , 2P:1C , 2P:2C");
		
		System.out.println("How many producers would you like? (1 or 2)");
		int proNum = input.nextInt();
		
		System.out.println("How many consumers would you like? (1 or 2)");
		int conNum = input.nextInt();
		
		
		if(proNum == 1 && conNum == 1){
			p1.start();
			c1.start();
		}
		else if(proNum == 1 && conNum == 2){
			p1.start();
			c1.start();
			c2.start();
		}
		else if(proNum == 2 && conNum == 1){
			p1.start();
			p2.start();
			c1.start();
		}
		else if(proNum == 2 && conNum == 2){
			p1.start();
			p2.start();
			c1.start();
			c2.start();
		}
		else{
			System.out.println("Please input 1 or 2 for Consumer/Producer number.");
			main(args);
		}
		
		return;
	}
}