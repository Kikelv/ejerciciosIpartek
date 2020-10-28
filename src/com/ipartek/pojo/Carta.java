package com.ipartek.pojo;

public class Carta {

	protected int num;
	protected String palo;

	public Carta() {
		super();
		this.num = num;
		this.palo = palo;
	}

	public Carta(int num, String palo) {
		super();
		this.num = num;
		this.palo = palo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta " + num + " de " + palo;
	}

}
