package ezen.array;

/**
 * 다차원 배열 선언, 생성, 사용하기
 * @author 이대한
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][] array;
//		array = new int[2][5];
//		array[0][0] = 88;
//		array[0][1] = 98;
//		array[0][2] = 75;
//		array[0][3] = 100;
//		array[0][4] = 100;
//		array[1][0] = 50;
//		array[1][4] = 100;
//		int[][] array = 
//				new int[][] {
//							{88, 98, 75, 100, 100},
//							{50, 60, 70, 80, 90}
//							};
		
		int[][] array = {
						{88, 98, 75, 100, 100},
						{50, 60, 70, 80, 90}
						};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1)+"반 성적");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
//		int sum1 = 0;
//		System.out.println("1반 전체 학생수 : " + array[0].length);
//		for (int i = 0; i < array[0].length; i++) {
//			sum1 += array[0][i];
//		}
//		System.out.println("총점 : " + sum1);
//		System.out.println("평균 : " + sum1/array[0].length);
		
		System.out.println();
		
		int total;
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1)+"반의 총원은 : "+array[i].length+"명입니다.");
			total = 0;
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];	
			}
			System.out.println((i+1)+"반의 총점은 : "+total+"점입니다");
			System.out.println((i+1)+"반의 평균은 : "+total/array[i].length+"점입니다");
		}
							
	}
}