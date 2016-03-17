import java.util.Scanner;

public class Compounding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("----------------------欢迎使用本系统---------------------");
		System.out.print("\n请输入你所需要的服务(请输入对应数字):");
		int a = 0;
		while (a == 0) {
			System.out.print("\n1.复利终值   2.单利总息   3.单利本金    4.复利存期   5.复利利率   6.   7.退出\n");
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
				System.out.print("你所输入的指令错误！请重新输入！！");
				break;
			}
		}
	}

	static void CompoundSum() {
		// 复利计算：总额＝本金×(1+利率)^存期
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你要存款的本金:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("请输入你的利息期数:");
		int compoundYear = scanner.nextInt();
		System.out.print("请输入当前利率:");
		float compoundRate = scanner.nextFloat();
		float compoundSum = 1;
		for (int i = 1; i <= compoundYear; i++) {
			compoundSum = compoundSum * (1 + compoundRate);
		}
		System.out.print("你的复利终值为:" + compoundMoney * compoundSum + "元");
	}

	static void SimpleInterest() {
		// 单利计算：本息＝本金×利率×存期
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你要存款的本金:");
		double simpleMoney = scanner.nextDouble();
		System.out.print("请输入你的存期:");
		int simpleYear = scanner.nextInt();
		System.out.print("请输入当前利率:");
		float simpleRate = scanner.nextFloat();
		float interest = 0; // 利息
		interest = (float) (simpleMoney * simpleYear * simpleRate);
		System.out.print("你的单利本息为:" + interest + "元");
	}

	static void SimpleMoney() {
		// 本金=本息和÷（1+存期*利率）
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你的本息和:");
		double simpleSum = scanner.nextDouble();
		System.out.print("请输入你的存期:");
		int simpleYear = scanner.nextInt();
		System.out.print("请输入当前利率:");
		float simpleRate = scanner.nextFloat();
		float simpleMoney = 0;
		simpleMoney = (float) (simpleSum / (1 + simpleYear * simpleRate));
		System.out.print("你所需存入的本金为:" + simpleMoney + "元");
	}

	static void CompoundYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你要存款的本金:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("请输入当前利率:");
		float compoundRate = scanner.nextFloat();
		System.out.print("请输入你的终值:");
		int compoundSum = scanner.nextInt();	
		int compoundYear= (int) ((Math.log(compoundSum)/Math.log(1+compoundRate))-(Math.log(compoundMoney)/Math.log(1+compoundRate)));
		System.out.print("你所需的存期为:"+compoundYear+"年");
	}
	
	static void CompoundRate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你要存款的本金:");
		double compoundMoney = scanner.nextDouble();
		System.out.print("请输入存期:");
		int compoundYear = scanner.nextInt();
		System.out.print("请输入你的终值:");
		int compoundSum = scanner.nextInt();
		float compoundRate = (float) ((Math.pow(compoundSum/compoundMoney, 1.0/compoundYear))-1);  
		System.out.print("报酬率应为:"+compoundRate*100+"%");
	}
		
		
		
}
