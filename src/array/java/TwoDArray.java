package array.java;

public class TwoDArray {
	static int[][] student = {{1,2,3},{4,5,6}};
	public static void main(String[] args) {
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student[i].length;j++) {
				System.out.println(student[i][j]);
			}
		}
		//single element
		System.out.println("\n" +student[1][2]);
	}
	

}
