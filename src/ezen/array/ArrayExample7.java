package ezen.array;

import java.util.Scanner;
import oop.Account;

/**
 * @author 이대한
 * @date 2023. 1. 2.
 * 배열을 이용한 은행 계좌 목록 관리
 */
public class ArrayExample7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		int index = 0;
		
		// 계좌 개설
		Account account1 = new Account("1111-2222", "이*한", 1111, 100000);
		System.out.println(account1.toString());
		
		// 배열에 계좌 등록
		accounts[index++] = account1;
		accounts[index++] = new Account("1111-3333", "우*한", 1111, 100000);
		accounts[index++] = new Account("1111-4444", "하*원", 1111, 100000);
		
		// 등록된 모든 계좌정보 출력
		for (int i = 0; i < index; i++) {
			Account acc = accounts[i];
			acc.toString();
			
		}
		
		System.out.println("------ 계좌 검색 테스트 ------");
		
		// 계좌번호로 계좌 검색
//		String serachNum = "1111-3333";
		String serachNum = null;
		
		System.out.print("검색하고자 하는 계좌번호 : ");
		Scanner scanner = new Scanner(System.in);
		serachNum = scanner.nextLine();
		
		for (int i = 0; i < index; i++) {
			 String number = accounts[i].getAccountNumber();
			 if(serachNum.equals(number)) {
				 accounts[i].toString();
			 }
		   }
		
		String name1 = new String("이대한");
		String name2 = new String("이대한");
		System.out.println(name1 == name2); // 주소값 비교
		System.out.println(name1.equals(name2));
		
		}
	}