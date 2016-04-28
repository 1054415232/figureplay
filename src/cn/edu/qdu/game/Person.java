package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	String yourname;
	int yourlist;
	Scanner input = new Scanner(System.in);

	@Override
	public String inputName() {
		System.out.print("ÇëÊäÈëÄãµÄĞÕÃû£º");
		yourname = input.next();
		return yourname;
	}

	@Override
	public int myFist() {

		yourlist = input.nextInt();
		return yourlist;
	}
}
