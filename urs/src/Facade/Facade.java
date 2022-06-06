package Facade;

import java.io.IOException;

public class Facade {
	
	Price price = new Price();
	Entry entry = new Entry();

	public int execude() {
		return price.pr();
	}
	public void save() throws IOException {
		entry.save();
	}
}
