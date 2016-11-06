package assignment;

import java.util.Scanner;

public abstract class Robot {
	protected double energyUnitsRequired = 0.25;
	protected double height;
	protected String manufacturer;
	protected String name;
	protected String purpose;
	protected double weight;
	protected double energy = 0.0;
	
	public Scanner in = new Scanner(System.in);
	
	public Robot(String name, double height, double weight, String manufacturer) {
		super();
		this.height = height;
		this.manufacturer = manufacturer;
		this.name = name;
		this.weight = weight;
		purpose = "the robots purpose needs to be provided";
	}
	
	public double getEnergyUnitsRequired() {
		return energyUnitsRequired;
	}
	public double getHeight() {
		return height;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getName() {
		return name;
	}
	public String getPurpose() {
		return purpose;
	}
	public double getWeight() {
		return weight;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergyUnitsRequired(double energyUnitsRequired) {
		this.energyUnitsRequired = energyUnitsRequired;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public void energyConsumption(){
		System.out.println("I have " + getEnergy() + " units of energy to begin with.");
		double priorEnergy = energy;
		energy = priorEnergy-energyRequired();
		priorEnergy -= energy;
		System.out.println("My energy has depleted by the following amount " + energyRequired() + " units.");
		System.out.println("My energy is now at " + energy);
	}
	public double energyRequired(){
		//multiply the energy units required by the robot weight
		double energyRequired = energyUnitsRequired*weight;
		return energyRequired;
	}
	
	public abstract void start();
	public abstract void stop();
	public abstract void doTask();
	
	public void regenerate(){
		energy = energy + (weight*2);
		System.out.println("Regenerating energy");
	}
	public abstract void doTask(Scanner in);

}
