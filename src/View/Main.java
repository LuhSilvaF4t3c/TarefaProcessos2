package View;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
		
			Controller controller = new Controller();
			String os = controller.os();
			
			System.out.println(os);
			
			String process = "TASKLIST /FO TABLE";
			controller.readProcess(process);

//			String process = "TASKKILL /PID ";
//			controller.callProcess(process);
			

	}

}
