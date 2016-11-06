package assignment;

import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
		HumanStudyRobot rob1 = new HumanStudyRobot("HRP", 1.5, 58, "Kawada Industries");
		EntertainmentRobot rob2 = new EntertainmentRobot("QRIO", 0.6, 7.3, "SONY");
		System.out.println(rob1.toString());
		System.out.println(rob2.toString());
		//rob1.start();
		//rob1.study();
		//rob1.stop();
		startRobot(rob1, rob2, null);
		
	}
	public static void startRobot(HumanStudyRobot rob1, EntertainmentRobot rob2, Scanner in){
		rob2.start();
		rob2.doTask(in);
		rob2.stop();
		rob1.start();
		rob1.doTask();
		rob1.stop();
		
		
	}

}
