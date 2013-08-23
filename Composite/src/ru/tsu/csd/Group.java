package ru.tsu.csd;

import java.util.ArrayList;
import java.util.List;

public class Group extends Component {
	private List<Component> list = new ArrayList<Component>();
	public void dealDmg() {
		for (Component c : list) {
			c.dealDmg();
		}
	}
	public void add(Component c) {
		list.add(c);
	}
	public void remove(Component c) {
		list.remove(c);
	}
}
