package ezen.array;

/**
 * 배열 선언, 생성, 사용하기
 * @author 이대한
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = {3, 6, 1, 5, 15};
		
		// 배열 복사
//		int[] array2 = new int[10];
		int[] array2 = {0, 0, 0, 0, 0, 3, 6, 1, 5, 15};
		System.out.println("총 배열: " + array2.length);
		
		
		for(int i=0; i<array.length; i++) {
			array2[i] = array[i];
		}
		System.out.println(array2[0]);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + "\t");
		}
		
		
		// mission : 오름차순 정렬하기...
		// 구현하세요
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				int temp = 0;
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println(array[i]);
		}

	}
}