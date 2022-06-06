package urs;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static List<String> list = new ArrayList<>();
	private static List<Integer> price = new ArrayList<>();

	public static List<String> getList() {
		return list;
	}


	public void add(String e) {
		list.add(e);
	}
	public int size() {
		return list.size();
	}
	public void print(){
	
    System.out.println("Ваш заказ");
		
	for (String part : list) {
		System.out.println(part);
	}
	}
	public  Integer poZnaceniu(int index) {
		 return price.get(index);
	}

	public  List<Integer> getPrice() {
		return price;
	}

	public  void addPrice(int i) {
		price.add(i);
	}
	public int sizePrice() {
		return price.size();
	}
}
