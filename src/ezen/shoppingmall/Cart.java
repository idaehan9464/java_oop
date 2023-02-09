package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들을 담고, 제거하고, 검색하고 동의 기능 제공
 * @author 이대한
 * @Date   2023. 1. 5.
 */
public class Cart {
	// 필드의 다형성
	private Item[] items;
	private int count;
	private int capacity;
	
	
	public Cart() {}
	
	public Cart(int capacity) {
		this.capacity = capacity;
		items = new Item[capacity];
	}

	// 카트에 담긴 전체 상품 목록 반환
	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// 카트에 상품 담기
	// 매게변수의 다향성
	public void addItem(Item item) {
		items[count++] = item;
	}
	
	// 상품이름으로 상품 검색
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
			Item item = items[i];
			boolean exit = item.getName().equals(name);
			if(exit) {
			return item;
			}
		}
		return null;
	}
	
	
	// 카트에서 상품 제거
	public boolean removeItem(String name) {
		for (int i = 0; i < count; i++) {
			if (items[i].getName().equals(name)) {
				for (int j = i; j < count-1; j++) {
					items[j] = items[j+1];
				}
				System.out.println("삭제 완료");
				count--;
				return true;
			}
		}
		return false;
	}
	
	// 카트에서 상품 제거
	public void removeAll() {
			for (int i = 0; i < count; i++) {
				items[i] = null;
			}
			items = new Item[capacity];
			count = 0;
	}
}