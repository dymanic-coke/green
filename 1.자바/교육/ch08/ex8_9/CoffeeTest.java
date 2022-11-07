package ch08.ex8_9;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee("김가네 카페모카", 5500);
		System.out.printf("%s(%d원) -> ", coffee.getName(), coffee.getPrice() );
		
		coffee.setChange("맛있는 카페모카",coffee.getPrice()+1000);
		System.out.printf("%s(%d원)", coffee.getName(), coffee.getPrice());
		

		
	}

}


class Coffee{
	
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setChange(String n, int p) {
		this.price = p;
		this.name = n;
	}
	
}