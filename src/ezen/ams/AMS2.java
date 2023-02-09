package ezen.ams;

public class AMS2 {

	public static void main(String[] args) {
		AccountRepository repository = new ArrayAccountRepository(100);
		// 가상(테스트) 데이터 등록
		repository.addAccount(new Account("1111-2222", "이대한", 1111, 100000));
		repository.addAccount(new MinusAccount("2222-3333", "이대출", 1111, 100000, 100000000, "2023.1.1"));
		
		AccountFrame frame = new AccountFrame(Account.BANK_NAME+" AMS", repository);
		frame.initLayout();
		frame.addEventListener();
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}