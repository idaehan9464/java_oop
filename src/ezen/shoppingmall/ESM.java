package ezen.shoppingmall;

public class ESM {
	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		Album album = new Album(10, "Dynamite", 10000, "BTS");
		
		// 카트에 상품 담기
		myCart.addItem(album);
		
		Movie movie = new Movie(11, "아바타:물의 길", 15000, "제임스 카메론", "이대한");
		myCart.addItem(movie);
		
		// 카트 상품 목록 조회
		Item[] myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
		}
		
		System.out.println("--------검색 테스트--------");
		
		// 카트 상품 검색
		String searchName = "Dynamite";
		Item searchItem = myCart.findByName(searchName);
		if(searchItem != null) {
//			System.out.println(searchItem.toString());
			System.out.println(searchItem);
			Album al = (Album)searchItem;
			System.out.println(al.getArtist());
		}else {
			System.out.println("검색된 상품이 없시유....");
		}
		
		myCart.removeItem("아바타:물의 길");
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
		}
		
		myCart.removeAll();
			System.out.println(myCart.getCount());
		}
}