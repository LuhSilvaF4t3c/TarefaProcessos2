package View;

import Controller.Controller;

public class Principal2 {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
//		String process = "TASKLIST /FO TABLE";
//		controller.readProcess(process);

		String process = "TASKKILL /PID 540";
		controller.callProcess(process);
		
		

	}

}
