package main;

import java.util.Scanner;

public class IdleGame {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		Model model = new Model();
		Controller controller = new Controller(model);
		
		System.out.println("INTRO MESSAGE!");
		String input = "";
		while(!input.equals("quit")) {
			if(input.equals("update"))
				controller.update();
			else {
				// TODO: buy and selling producers
			}
			
			input = key.next();
		}
	}
}
