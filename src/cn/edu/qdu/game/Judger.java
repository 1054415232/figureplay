package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	Scanner input = new Scanner(System.in);
	int nameid = 0;
	String computername, yourname;
	int yournum = 0;
	int computernum = 0;
	int pf = 0;// 玩家数字
	int cf = 0;// 随机数字
	String yourlist, computerlist;
	int count = 0;

	Person person = new Person();
	Computer computer = new Computer();

	public void startGame() {
		System.out.println("*******************");
		System.out.println("*****猜拳，开始****");
		System.out.println("*******************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}

	public void askName() {
		computername = computer.inputName();
		yourname = person.inputName();
		System.out.println(yourname + " VS " + computername + " 对战");

	}

	public void playGame() {
		System.out.print("要开始吗？（y/n）");
		String yn;
		yn = input.next();
		if (yn.equalsIgnoreCase("y")) {
			count++;
			System.out.print("请出拳：1.剪刀2.石头3.布（输入相应数字）：");

		} else if (yn.equalsIgnoreCase("n")) {
			// 显示结果
			System.out.print("游戏结束");
		} else {
			System.out.println("error");
		}
	}

	public void fianlResult() {
		pf = person.myFist();
		yourlist = person.content(pf);
		System.out.println("你出拳:" + yourlist);
		cf = computer.myFist();
		computerlist = person.content(cf);
		System.out.println(computername + "出拳:" + computerlist);
		if (pf > cf && pf - cf == 1) {
			System.out.println("^_^，你赢了，真聪明！");
			yournum++;
		} else if (pf == cf) {
			System.out.println("^_^，平局,再接再厉！！");
		} else {
			System.out.println("^_^，你输了，真笨！");
			computernum++;
		}
	}

	public void result() {
		System.out.println(yourname + " VS " + computername);
		System.out.println("对战次数：" + count);
		System.out.println("姓名\t得分");
		System.out.println(yourname + "\t" + yournum);
		System.out.println(computername + "\t" + computernum);
		if (yournum>computernum) {
			System.out.println("结果为：真乃神人也！");
		}
		else if(yournum==computernum){
			System.out.println("结果为：平分秋色！");
		}
		else {
			System.out.println("结果为：呵呵，笨笨，下次加油啊！");
		}
	}

	public static void main(String[] args) {
		String yn;
		Judger judger = new Judger();
		judger.startGame();
		judger.askName();
		do {
			judger.playGame();
			judger.fianlResult();
			System.out.print("是否开始下一轮（y/n）：");
			Scanner input = new Scanner(System.in);
			yn = input.next();
		} while (yn.equalsIgnoreCase("y"));
		judger.result();
	}

	public String getComputername() {
		return computername;
	}

	public void setComputername(String computername) {
		this.computername = computername;
	}

	public String getYourname() {
		return yourname;
	}

	public void setYourname(String yourname) {
		this.yourname = yourname;
	}

	public int getYournum() {
		return yournum;
	}

	public void setYournum(int yournum) {
		this.yournum = yournum;
	}

	public int getComputernum() {
		return computernum;
	}

	public void setComputernum(int computernum) {
		this.computernum = computernum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
