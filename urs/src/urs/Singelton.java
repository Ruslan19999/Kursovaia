package urs;

import java.io.IOException;
import java.util.Scanner;

import Builder.BigHappyMealBuilder;
import Builder.Director;
import Builder.HappyMeal;
import Builder.HappyMealBuilder;
import Builder.SmallHappyMealBuilder;
import Decorator.BulgariaPizza;
import Decorator.DvoinimSirom;
import Decorator.FruttidiMarePizza;
import Decorator.ItalianPizza;
import Decorator.Pizza;
import Facade.Facade;
import Iterator.Iterator;
import Iterator.Napitki;
import Strategy.Cash;
import Strategy.Contextt;
import Strategy.CreditCart;

public class Singelton {

	private static Singelton singelton;

     Director director = new Director();
     HappyMealBuilder small_hmbuilder = new SmallHappyMealBuilder();
     HappyMealBuilder big_hmbuilder = new BigHappyMealBuilder();
     Scanner scanner = new Scanner(System.in);
	 Napitki napitki = new Napitki();
	 Iterator iterator = napitki.getIterator();
	 Contextt context = new Contextt();
	 Order order = new Order();
	 Facade facade = new Facade();
	
	private Singelton() throws IOException {

		System.out.println("1: Меню");
		System.out.println("2: Выход");
		int menu = scanner.nextInt();
		if(menu == 2) {
			System.exit(0);
		}
		while(true) {
		
			System.out.println("1: Пиццы");
			System.out.println("2: Напитки");
			System.out.println("3: Наборы");
			int menu2 = scanner.nextInt();

			switch (menu2) {
			case 1:
				Pizza pizza1 = new ItalianPizza();
				Pizza pizza2 = new BulgariaPizza();
				System.out.println("1: Итальянская пицца");
				
				System.out.println("2: Итальянская пицца с море продуктами");
				
				System.out.println("3: Итальянская пицца с двойным сыром");
				System.out.println("4: Болгарская пицца");
				System.out.println("5: Болгарская пицца с море продуктами");
				System.out.println("6: Болгарская пицца с двойным сыром");
				
				int pizza = scanner.nextInt();
				switch(pizza) {
				case 1:
					System.out.println("Название " + pizza1.getInfo());
					System.out.println("Цена " + pizza1.getPrice());
					break;
				case 2:
					pizza1 = new FruttidiMarePizza(pizza1);
					System.out.println("Название " + pizza1.getInfo());
					System.out.println("Цена " + pizza1.getPrice());
					break;
                case 3:
                	pizza1 = new DvoinimSirom(pizza1);
					System.out.println("Название " + pizza1.getInfo());
					System.out.println("Цена " + pizza1.getPrice());
					break;
				case 4:
					System.out.println("Название " + pizza2.getInfo());
					System.out.println("Цена " + pizza2.getPrice());
					break;
                case 5:
                	pizza2 = new FruttidiMarePizza(pizza2);
					System.out.println("Название " + pizza2.getInfo());
					System.out.println("Цена " + pizza2.getPrice());
					break;
                case 6:
                	pizza2 = new DvoinimSirom(pizza2);
					System.out.println("Название " + pizza2.getInfo());
					System.out.println("Цена " + pizza2.getPrice());
	                break;
				default:
					break;
				}
				if(pizza == 1 || pizza == 2 || pizza == 3) {
				    order.add(pizza1.getInfo());
				    order.addPrice(pizza1.getPrice());
				}else if(pizza == 4 || pizza == 5 || pizza == 6) {
				         order.add(pizza2.getInfo());
						 order.addPrice(pizza2.getPrice());

				}
				break;
				
			case 2:
				int i = 0;
				while(iterator.hasNext()) {
					String name = (String)iterator.next();
					System.out.println(name);
					System.out.println("Цена: " +napitki.price[i]);
                    i++;
				}
				System.out.println("Ваш выбор");
				int nap = scanner.nextInt();
					switch(nap) {
					case 1:
						System.out.println("Ваш выбор: " + napitki.napitki[0]);
						order.add(napitki.napitki[0]);
						 order.addPrice(napitki.price[0]);

						break;
					case 2:
						System.out.println("Ваш выбор: " + napitki.napitki[1]);
						order.add(napitki.napitki[1]);
						 order.addPrice(napitki.price[1]);

						break;
					case 3:
						System.out.println("Ваш выбор: " + napitki.napitki[2]);
						order.add(napitki.napitki[2]);
						 order.addPrice(napitki.price[2]);

						break;
					case 4:
						System.out.println("Ваш выбор: " + napitki.napitki[3]);
						order.add(napitki.napitki[3]);
						 order.addPrice(napitki.price[3]);

						break;
					default:
						break;
					}
				break;

			case 3:
				System.out.println("1: Маленький набор");
				System.out.println("Цена: 40");

				System.out.println("2: Большой набор");
				System.out.println("Цена: 80");

				System.out.println("Ваш выбор набора");
				int vibor = scanner.nextInt();
				
				if(vibor == 1) {
					director.Construct(small_hmbuilder);
			        HappyMeal hm1 = small_hmbuilder.GetProduct();
					System.out.println("Вы выбрали");
			        hm1.Show();
					order.add("Happy Meal Parts small");
					order.addPrice(40);

				}else if(vibor == 2) {
					 director.Construct(big_hmbuilder);
				        HappyMeal hm2 = big_hmbuilder.GetProduct();
				        System.out.println("Вы выбрали");
				        hm2.Show();
						order.add("Happy Meal Parts big");
						 order.addPrice(80);

				}
				
				break;
			default:
				break;
			} 
			System.out.println("1: Посчитать");
			System.out.println("2: Добавить");
			int postitati = scanner.nextInt();
			if(postitati == 1) {
				
				System.out.println("Способ оплаты");
				System.out.println("1: CreditCart");
				System.out.println("2: Cash");
				int result = scanner.nextInt();

				if(result == 1){
			
				    System.out.println("Имя");	
	                String resulte = scanner.next();
					System.out.println("Номер карты");
					long number = scanner.nextLong();
					
					int leng = String.valueOf(number).length();
					
					if (leng != 16) {
						while(leng != 16) {
						System.out.println("Должно быть 16 цифр");
						System.out.println("Номер карты");
						long number2 = scanner.nextLong();
						number = number2;
						leng = String.valueOf(number).length();

					    }
					}

                    
					 context.setStrategy(new CreditCart(resulte, number));
				}else if(result == 2) {
					context.setStrategy(new Cash());
				}
				context.Pay(facade.execude());
				facade.save();
				break;
			}
		}
	}

	public static synchronized Singelton getSingelton() throws IOException {
		if(singelton == null) {//если объект еще не создан
			singelton = new Singelton();//создать новый объект
		}
		return singelton;// вернуть ранее созданный объект
	}
}
