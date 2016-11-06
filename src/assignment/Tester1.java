package assignment;


public class Tester1 {

	public static void main(String[] args) {
		HumanStudyRobot rob1 = new HumanStudyRobot("HRP", 1.5, 58, "Kawada Industries");
		System.out.println(rob1.toString());
		rob1.start();
		rob1.study();
		rob1.stop();
	}

}
