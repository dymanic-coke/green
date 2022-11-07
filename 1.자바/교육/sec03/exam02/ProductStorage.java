package sec03.exam02;

import java.util.*;

public class ProductStorage {
	
	private List<Product> list = new ArrayList<>();
	private Scanner scan = new Scanner(System.in);
	private int count;
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1. 등록 || 2. 목록  || 3.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택 : ");
			String selectNo = scan.nextLine();
			switch(selectNo) {
			case "1":
				registerProduct();
				break;
			case "2":
				showProducts();
				break;
			case "3":
				System.out.println("종료합니다.");
				return;
			}
		}
	}
	
	public void registerProduct() {
		
		try {
			Product product = new Product();
			product.setPno(++count);
			
			System.out.print("상품명: ");
			product.setName(scan.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scan.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scan.nextLine()));
			
			list.add(product);
		} catch(Exception e){
			System.out.println("등록에러: " + e.getMessage());
		}
	}
	
	public void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "원\t" + p.getStock() + "개");
		}
	}
	
}
