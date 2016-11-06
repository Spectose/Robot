package assignment;

import java.util.Scanner;

public class EntertainmentRobot extends Robot implements Talkable, Walkable{
	
	
	public EntertainmentRobot(String name, double height, double weight, String manufacturer) {
		super(name, height, weight, manufacturer);
		purpose = "To live with you, make life fun and make you happy";
		energy = 10.0;
		energyUnitsRequired = 0.75;
	}
	public void start(){
		System.out.println("-----I AM A ENTERTAINMENT ROBOT-----");
	}
	public void stop(){
		System.out.println("I have finished entertaining");
	}
	public void play(){
		System.out.println("How many times should we play?");
		int response = in.nextInt();
		in.nextLine();
		if(energy >= energyRequired() * response){
			energyConsumption();
		} else {
			System.out.println("Need more energy to play.");
			regenerate();
			System.out.println("I am ready to play again.");
		} 
	}
	
	@Override
	public String toString() {
		return "Entertainment Robot details:" + "\n" + "[Name: " + getName() + ", Weight: " + getWeight() + ", Height: " + getHeight() + ", Manufacturer: " + getManufacturer() + ", Purpose: " + getPurpose() + "]";
	}
	
	@Override
	public void doTask() {
		play();
		talk(in);
		walk(in);
	}
	@Override
	public void doTask(Scanner in) {
		
	}
	@Override
	public void walk(Scanner in) {
		System.out.println("Would you like me to walk? (y/n): ");
		String walkString = in.nextLine();
		if(walkString.equalsIgnoreCase("y")){
			System.out.println("For how many paces?");
			int paces = in.nextInt();
			in.nextLine();
			System.out.println("1): " + Directions.Forward.toString());
			System.out.println("2): " + Directions.Backward.toString());
			System.out.println("3): " + Directions.Left.toString());
			System.out.println("4): " + Directions.Right.toString());
			System.out.println("Which direction should I walk? (Enter Number)");
			int choice = in.nextInt();
			in.nextLine();
			switch(choice){
			case 1: if (choice == 1){
				System.out.println("I have walked " + Directions.Forward.toString() + " " + paces + " steps"); break;
			}
			case 2: if (choice == 2){
				System.out.println("I have walked " + Directions.Backward.toString() + " " + paces + " steps"); break;
			}
			case 3: if (choice == 3){
				System.out.println("I have walked " + Directions.Left.toString() + " " + paces + " steps"); break;
			}
			case 4: if (choice == 4){
				System.out.println("I have walked " + Directions.Right.toString() + " " + paces + " steps"); break;
			}
			}
		} else {
			System.out.println("I am not allowed to walk today");
		}
		
	}
	@Override
	public void talk(Scanner in) {
		System.out.println("Please enter something for me to say:");
		String talkString = in.nextLine();
		System.out.println("You have asked me to say: " + talkString);
		
	}

}
