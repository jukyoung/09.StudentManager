package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO(); // 저장소는 딱 한번만 만들어져야 하기 때문에 while문 바깥으로
		// 그 클래스의 인스턴스를 생성하고 그 참조변수가 있어야 함
		while (true) {
			System.out.println("\n==== 학생 관리 프로그램 ====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)");
			System.out.println("\n1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.print(">> ");
			String menu = sc.nextLine();

			if (menu.equals("1")) {
					System.out.println("\n==== 학생 정보 등록 ====");
					System.out.print("번호를 입력하세요 >> ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("이름을 입력하세요 >> ");
					String name = sc.nextLine();

					System.out.print("나이를 입력하세요 >> ");
					int age = Integer.parseInt(sc.nextLine());

					System.out.print("성별을 입력하세요(남/여) >> ");
					char gender = sc.nextLine().charAt(0);
					
					StudentDTO std = new StudentDTO(no, name, age, gender);
					dao.insert(std);


			} else if (menu.equals("2")) {
				System.out.println("==== 학생 목록 확인 ====");
				
			
				StudentDTO[] list = dao.selectAll();
				for(StudentDTO std : list) {
					if(std != null) {
						System.out.println(std);
					}
				}
				
			} else if (menu.equals("3")) {
				System.out.println("==== 학생 정보 수정 ====");
				System.out.print("수정할 학생의 번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				//사용자가 입력한 번호가 존재하는 번호인지 확인하는 메서드 추가해도 될듯
//				if(dao.doseNoExist(no)) {
//					// 수정
//				}else {
//					// 다시 입력해라하는 문구
//				}
				// Integer.parseInt -> 숫자가 아닌 입력값에 대한 처리 메서드
				// => 사용자의 입력과 관련된 메서드 이기 때문에 static 메서드로 Run02 클래스에 만들어야 함.
				System.out.print("이름을 수정하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 수정하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 수정하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);	
				
				dao.modify(new StudentDTO(no, name, age, gender));
				// StudentDTO dto = new StudentDTo(no, name, age, gender)
				// dao.modify(dto) 와 같다
				System.out.println("학생정보 수정이 완료되었습니다.");
				
			} else if (menu.equals("4")) {
				System.out.println("==== 학생 정보 삭제 ====");
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				
				dao.delete(no);
				
				System.out.println("학생정보가 삭제되었습니다.");

			} else if (menu.equals("q")) {
				System.out.println("\n프로그램을 종료합니다.");
				System.out.println("==== Bye Bye ====");
				break;
			} else {
				System.out.println("잘못된 접근입니다.");
				break;
			}
		}

	}

}
