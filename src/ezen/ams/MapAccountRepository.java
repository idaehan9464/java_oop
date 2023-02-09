package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapAccountRepository {

	private Map<String , Account> accounts;

	public MapAccountRepository() {
		accounts = new HashMap<>();
	}
	
	public void addAccount(Account account) throws RuntimeException{
		if(accounts.containsKey(account.getAccountNumber())) {
			throw new RuntimeException("이미 등록된 계좌입니다..");
		}else {
			accounts.put(account.getAccountNumber(), account);			
		}
	}
	
	public List<Account> getAccounts() {
		return new ArrayList<>(accounts.values());
	}
	
	public Account findByAccount(String number) {
		return accounts.get(number);
	}
	
	public boolean removeaccount(String number) {
		Account removeaccount = accounts.remove(number);
		if(removeaccount != null) {
			return true;
		}
		return false;
	}
}