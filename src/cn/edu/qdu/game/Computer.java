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
		System.out.print("��ѡ��Է���ɫ��1������2����Ȩ3���ܲ٣���");
		nameid = input.nextInt();
		switch (nameid) {
		case 1:
			computername = "����";
			break;
		case 2:
			computername = "��Ȩ";
			break;
		case 3:
			computername = "�ܲ�";
			break;
		default:
			System.out.println("error");
			break;
		}
		return computername;
	}

	@Override
	public int myFist() {
		//����1-3֮��������������3
		Random rand = new Random();
		gamelist = rand.nextInt(3)+1;	
		return gamelist;
	}	
}
