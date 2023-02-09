package ezen.array;

/**
 * @author 이대한
 * @date 2023. 1. 2.
 * 참조형 배열 선언, 생성, 사용 방법
 */
public class ArrayExample6 {

	public static void main(String[] args) {
		// 1차원 참고형 배열 선언
		String[] strings;
		// 생성
		strings = new String[5];
//		strings[0] = new String("Java"); // 명시적 생성
		strings[0] = "Java"; // 묵시적 생성
		strings[1] = "C"; // 묵시적 생성
		strings[2] = "C++"; // 묵시적 생성
		strings[3] = "C#"; // 묵시적 생성
		strings[4] = "Python"; // 묵시적 생성
		
//		System.out.println(strings[0]);
		for (int i = 0; i < strings.length; i++) {
			//String str = "Java";
			//str.length();
//			String language = strings[i];
//			System.out.println(strings[i] + "("+language.length()+")");
			System.out.println(strings[i] + "("+strings[i].length()+")");
		}
		
		
		System.out.println();
		
		
		// 배열, 선언, 생성, 초기화를 동시에
//		String[] teams = new String[] {new String("삼성 라이온즈"), new String("LG트윈스"), new String("두산베어스")};
//		String[] teams = {new String("삼성 라이온즈"), new String("LG트윈스"), new String("두산베어스")};
		String[] teams = {"삼성 라이온즈", "LG트윈스", "두산베어스"};
		for (int i = 0; i < teams.length; i++) {
			System.out.println(teams[i]);
		}
		
		System.out.println();
		
		// 다차원 배열
		String[][] arrays = new String[3][5];
		arrays[0][0] = "FC서울";
		// ...
		arrays[2][4] = "수원FC";
		
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.println(arrays[i][j]);
			}
		}
	}
}