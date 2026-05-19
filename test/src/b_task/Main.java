package b_task;

public class Main {
	
	public static void main(String[] args) {
		StudentMain student = new StudentMain("홍길동", 19, 70, 60, 90);
		StudentMain student2 = new StudentMain("짱구", 5, 50, 70, 100);
		StudentMain student3 = new StudentMain("철수", 6, 90, 70, 40);
		System.out.println("===== 학생 정보 =====");
		student.printInfo();
		student.getTotal();
		student.getAvg();

		student2.printInfo();
		student2.getTotal();
		student2.getAvg();
		
		student3.printInfo();
		student3.getTotal();
		student3.getAvg();
	}
}