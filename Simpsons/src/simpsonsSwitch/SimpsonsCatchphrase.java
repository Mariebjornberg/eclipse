package simpsonsSwitch;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpsonsCatchphrase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Character simpsonlist = new Character();
		ArrayList simpsons = simpsonlist.simpsons();
		System.out.println(simpsons);
		System.out.println("See the catch phrases of your favourite simpsons characters(choose between 1-11)");
		int choice = scan.nextInt();
		System.out.println(simpsons.get(choice-1));
		
		switch(choice){
		
		case 1:
			System.out.println("Doh!!");
			break;
		case 2:
			System.out.println("Mmm-mmmm");
			break;
		case 3:
			System.out.println("Ay-caramba!");
			break;
		case 4:
			System.out.println("If anyone wants me, I'll be in my room");
			break;
		case 5:
			System.out.println("Pacifier Suck");
			break;
		case 6:
			System.out.println("Hi-Diddily-Ho");
			break;
		case 7:
			System.out.println("Excellent");
			break;
		case 8:
			System.out.println("Ha!");
			break;
		case 9:
			System.out.println("SEEEEYYYMOOUURRR!");
			break;
		case 10:
			System.out.println("Thank you, come again");
			break;
		case 11:
			System.out.println("Disco Stu, likes Disco music");
			
		default: 
			System.out.println("please choose a number between 1-11");
			break;
		}
		//while(i) {
		//String [] phrase = {"Doh!","Mmm-mmmm","If anyone wants me, I'll be in my room.","Pacifier Suck","Hi-Diddily-Ho!\r\n"
				//+ "Excellent","Ha!","SEEEEYYYMOOUURRR!","Thank you, come again","Disco Stu, likes Disco music"};
		//System.out.println("Pick a catchphrase ");
						//System.out.println(simpsons);
						
						//while (true) {
						//int choice = Integer.valueOf(scan.nextLine());

	}
}
