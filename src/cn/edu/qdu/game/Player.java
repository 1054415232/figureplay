package cn.edu.qdu.game;

abstract class Player {
	String listcontent;

	abstract String inputName();

	abstract int myFist();

	public String content(int list) {
		switch (list) {
		case 1:
			listcontent = "����";
			break;
		case 2:
			listcontent = "ʯͷ";
			break;
		case 3:
			listcontent = "��";
			break;
		default:
			System.out.println("error");
			break;
		}
		return listcontent;
	}
}
