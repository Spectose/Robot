package assignment;

import java.util.Scanner;

public class HumanStudyRobot extends Robot implements Walkable {
	
	public HumanStudyRobot(String name, double height, double weight, String manufacturer) {
		super(name, height, weight, manufacturer);
		purpose = "Study into human movement and perform a wide range of tasks";
		energy = 30;
	}
	public void start(){
		System.out.println("-----I AM A HUMAN STUDY ROBOT-----");
	}
	public void stop(){
		System.out.println("I have finished studying people");
	}
	public void study(){
		if(energy < energyRequired()){
			System.out.println("I have started studying people");
			energyConsumption();
		} else {
			System.out.println("Not enough energy");
			regenerate();
			System.out.println("Finished regenerating");
		}
		
	}
	//to string
	
	public void doTask() {
		study();
		walk(in);
	}
	@Override
	public String toString() {
		return "Human Study Robot details: " + "\n" + " [Name: " + getName() + ", Weight: " + getWeight() + ", Height: " + getHeight() + ", Manufacturer: " + getManufacturer() + ", Purpose: " + getPurpose() + "]";
	}
	@Override
	public void doTask(Scanner in) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk(Scanner in) {
		System.out.println("How many paces should i walk?");
		int paces2 = in.nextInt();
		in.nextLine();
		if(paces2 <= 10){
			System.out.println("I have walked " + paces2 + " steps");
		} else {
			System.out.println("Sorry I cant walk that far.");
		}
		
	}
}
