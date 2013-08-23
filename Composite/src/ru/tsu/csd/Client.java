package ru.tsu.csd;

public class Client {
	public static void main(String[] args) {
		Component c1 = new Shooter();
		Component c2 = new Shooter();
		Component c3 = new Sniper();
		Component c4 = new Sniper();
		Group g1 = new Group();
		Group g2 = new Group();
		g1.add(c1);
		g1.add(c2);
		g1.add(c3);
		g2.add(c4);
		g2.add(g1);
		g2.dealDmg();
	}
}
