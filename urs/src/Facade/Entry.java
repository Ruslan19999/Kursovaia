package Facade;

import java.io.FileWriter;
import java.io.IOException;


import urs.Order;

public class Entry {

	Order order = new Order();
	
	public void save() throws IOException {
		
		 FileWriter writer = new FileWriter("D:/Kursovaia/output.txt"); 
		 for(String str: order.getList()) {
		   writer.write(str + System.lineSeparator());
		 }
		 writer.close();
	}
	
}
