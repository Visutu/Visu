import java.util.Scanner;

public class Compounding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("----------------------��ӭʹ�ñ�ϵͳ---------------------");
		System.out.print("\n������������Ҫ�ķ���(�������Ӧ����):");
		int a = 0;
		while (a == 0) {
			System.out.print("\n1.������ֵ   2.������Ϣ   3.��������    4.��������   5.��������   6.   7.�˳�\n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				CompoundSum();
				a = 1;
				break;
			case 2:
				SimpleInterest();
				a = 1;
				break;
			case 3:
				SimpleMoney();
				a=1;
				break;
			case 4:
				CompoundYear();
				a=1;
				break;
			case 5:
				CompoundRate();
				a=1;
				break;
			case 6:
				a=1;
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.print("���������ָ��������������룡��");
				break;
			}
		}
	}

	static void CompoundSum() {
		// �������㣺�ܶ�����(1+����)^����
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������Ҫ���ı���:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("�����������Ϣ����:");
		int compoundYear = scanner.nextInt();
		System.out.print("�����뵱ǰ����:");
		float compoundRate = scanner.nextFloat();
		float compoundSum = 1;
		for (int i = 1; i <= compoundYear; i++) {
			compoundSum = compoundSum * (1 + compoundRate);
		}
		System.out.print("��ĸ�����ֵΪ:" + compoundMoney * compoundSum + "Ԫ");
	}

	static void SimpleInterest() {
		// �������㣺��Ϣ����������ʡ�����
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������Ҫ���ı���:");
		double simpleMoney = scanner.nextDouble();
		System.out.print("��������Ĵ���:");
		int simpleYear = scanner.nextInt();
		System.out.print("�����뵱ǰ����:");
		float simpleRate = scanner.nextFloat();
		float interest = 0; // ��Ϣ
		interest = (float) (simpleMoney * simpleYear * simpleRate);
		System.out.print("��ĵ�����ϢΪ:" + interest + "Ԫ");
	}

	static void SimpleMoney() {
		// ����=��Ϣ�͡£�1+����*���ʣ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ı�Ϣ��:");
		double simpleSum = scanner.nextDouble();
		System.out.print("��������Ĵ���:");
		int simpleYear = scanner.nextInt();
		System.out.print("�����뵱ǰ����:");
		float simpleRate = scanner.nextFloat();
		float simpleMoney = 0;
		simpleMoney = (float) (simpleSum / (1 + simpleYear * simpleRate));
		System.out.print("���������ı���Ϊ:" + simpleMoney + "Ԫ");
	}

	static void CompoundYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������Ҫ���ı���:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("�����뵱ǰ����:");
		float compoundRate = scanner.nextFloat();
		System.out.print("�����������ֵ:");
		int compoundSum = scanner.nextInt();	
		int compoundYear= (int) ((Math.log(compoundSum)/Math.log(1+compoundRate))-(Math.log(compoundMoney)/Math.log(1+compoundRate)));
		System.out.print("������Ĵ���Ϊ:"+compoundYear+"��");
	}
	
	static void CompoundRate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������Ҫ���ı���:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("���������:");
		int compoundYear = scanner.nextInt();
		System.out.print("�����������ֵ:");
		int compoundSum = scanner.nextInt();
		float compoundRate = (float) ((Math.pow(compoundSum/compoundMoney, 1.0/compoundYear))-1);  
		System.out.print("������ӦΪ:"+compoundRate*100+"%");
	}
		
		
		
}
