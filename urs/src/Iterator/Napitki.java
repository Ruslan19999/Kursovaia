package Iterator;


public class Napitki implements Container{
public String[] napitki = new String[4];
public int[] price = new int[napitki.length];
	
	{	
		napitki[0] = " Kola ";
		price[0] = 14;
		napitki[1] = " Sprite ";
		price[1] = 10;
		napitki[2] = " Fanta";
		price[2] = 12;
		napitki[3] = " Обычная вода ";
		price[3] = 9;

	}
	
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CarIterator();
	}
	
	public class CarIterator implements Iterator{
		
		int index;

		@Override
		public boolean hasNext() {

			if(index < napitki.length) {
				return true;
			}

			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return napitki[index++];
			
		}
		
	}
}
