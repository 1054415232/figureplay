package cn.edu.qdu.game;

abstract class Player {
	String listcontent;

	abstract String inputName();

	abstract int myFist();

	public String content(int list) {
		switch (list) {
		case 1:
			listcontent = "¼ôµ¶";
			break;
		case 2:
			listcontent = "Ê¯Í·";
			break;
		case 3:
			listcontent = "²¼";
			break;
		default:
			System.out.println("error");
			break;
		}
		return listcontent;
	}
}
