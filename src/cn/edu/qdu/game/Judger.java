package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	Scanner input = new Scanner(System.in);
	int nameid = 0;
	String computername, yourname;
	int yournum = 0;
	int computernum = 0;
	int pf = 0;// �������
	int cf = 0;// �������
	String yourlist, computerlist;
	int count = 0;

	Person person = new Person();
	Computer computer = new Computer();

	public void startGame() {
		System.out.println("*******************");
		System.out.println("*****��ȭ����ʼ****");
		System.out.println("*******************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}

	public void askName() {
		computername = computer.inputName();
		yourname = person.inputName();
		System.out.println(yourname + " VS " + computername + " ��ս");

	}

	public void playGame() {
		System.out.print("Ҫ��ʼ�𣿣�y/n��");
		String yn;
		yn = input.next();
		if (yn.equalsIgnoreCase("y")) {
			count++;
			System.out.print("���ȭ��1.����2.ʯͷ3.����������Ӧ���֣���");

		} else if (yn.equalsIgnoreCase("n")) {
			// ��ʾ���
			System.out.print("��Ϸ����");
		} else {
			System.out.println("error");
		}
	}

	public void fianlResult() {
		pf = person.myFist();
		yourlist = person.content(pf);
		System.out.println("���ȭ:" + yourlist);
		cf = computer.myFist();
		computerlist = person.content(cf);
		System.out.println(computername + "��ȭ:" + computerlist);
		if (pf > cf && pf - cf == 1) {
			System.out.println("^_^����Ӯ�ˣ��������");
			yournum++;
		} else if (pf == cf) {
			System.out.println("^_^��ƽ��,�ٽ���������");
		} else {
			System.out.println("^_^�������ˣ��汿��");
			computernum++;
		}
	}

	public void result() {
		System.out.println(yourname + " VS " + computername);
		System.out.println("��ս������" + count);
		System.out.println("����\t�÷�");
		System.out.println(yourname + "\t" + yournum);
		System.out.println(computername + "\t" + computernum);
		if (yournum>computernum) {
			System.out.println("���Ϊ����������Ҳ��");
		}
		else if(yournum==computernum){
			System.out.println("���Ϊ��ƽ����ɫ��");
		}
		else {
			System.out.println("���Ϊ���Ǻǣ��������´μ��Ͱ���");
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
			System.out.print("�Ƿ�ʼ��һ�֣�y/n����");
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
