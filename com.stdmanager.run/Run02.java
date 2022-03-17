package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO(); // ����Ҵ� �� �ѹ��� ��������� �ϱ� ������ while�� �ٱ�����
		// �� Ŭ������ �ν��Ͻ��� �����ϰ� �� ���������� �־�� ��
		while (true) {
			System.out.println("\n==== �л� ���� ���α׷� ====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q)");
			System.out.println("\n1. �л� ���� ���");
			System.out.println("2. �л� ��� Ȯ��");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.print(">> ");
			String menu = sc.nextLine();

			if (menu.equals("1")) {
					System.out.println("\n==== �л� ���� ��� ====");
					System.out.print("��ȣ�� �Է��ϼ��� >> ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("�̸��� �Է��ϼ��� >> ");
					String name = sc.nextLine();

					System.out.print("���̸� �Է��ϼ��� >> ");
					int age = Integer.parseInt(sc.nextLine());

					System.out.print("������ �Է��ϼ���(��/��) >> ");
					char gender = sc.nextLine().charAt(0);
					
					StudentDTO std = new StudentDTO(no, name, age, gender);
					dao.insert(std);


			} else if (menu.equals("2")) {
				System.out.println("==== �л� ��� Ȯ�� ====");
				
			
				StudentDTO[] list = dao.selectAll();
				for(StudentDTO std : list) {
					if(std != null) {
						System.out.println(std);
					}
				}
				
			} else if (menu.equals("3")) {
				System.out.println("==== �л� ���� ���� ====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				//����ڰ� �Է��� ��ȣ�� �����ϴ� ��ȣ���� Ȯ���ϴ� �޼��� �߰��ص� �ɵ�
//				if(dao.doseNoExist(no)) {
//					// ����
//				}else {
//					// �ٽ� �Է��ض��ϴ� ����
//				}
				// Integer.parseInt -> ���ڰ� �ƴ� �Է°��� ���� ó�� �޼���
				// => ������� �Է°� ���õ� �޼��� �̱� ������ static �޼���� Run02 Ŭ������ ������ ��.
				System.out.print("�̸��� �����ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �����ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �����ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);	
				
				dao.modify(new StudentDTO(no, name, age, gender));
				// StudentDTO dto = new StudentDTo(no, name, age, gender)
				// dao.modify(dto) �� ����
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�.");
				
			} else if (menu.equals("4")) {
				System.out.println("==== �л� ���� ���� ====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				
				dao.delete(no);
				
				System.out.println("�л������� �����Ǿ����ϴ�.");

			} else if (menu.equals("q")) {
				System.out.println("\n���α׷��� �����մϴ�.");
				System.out.println("==== Bye Bye ====");
				break;
			} else {
				System.out.println("�߸��� �����Դϴ�.");
				break;
			}
		}

	}

}
