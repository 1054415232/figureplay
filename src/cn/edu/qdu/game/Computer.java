package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
	String computername;
	int gamelist;
	int nameid;
	Scanner input = new Scanner(System.in);

	@Override
	public String inputName() {
		System.out.print("请选择对方角色（1：刘备2：孙权3：曹操）：");
		nameid = input.nextInt();
		switch (nameid) {
		case 1:
			computername = "刘备";
			break;
		case 2:
			computername = "孙权";
			break;
		case 3:
			computername = "曹操";
			break;
		default:
			System.out.println("error");
			break;
		}
		return computername;
	}

	@Override
	public int myFist() {
		//生成1-3之间的随机数，包括3
		Random rand = new Random();
		gamelist = rand.nextInt(3)+1;	
		return gamelist;
	}	
}
