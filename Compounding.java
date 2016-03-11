import java.util.Scanner;


public class Compounding {

	public static void main(String[] args) {
		//复利计算：总额＝本金×(1+利率)^存期
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入你要存款的本金:");
		double money=scanner.nextDouble();
		System.out.print("请输入你的利息期数:");
		int year=scanner.nextInt();
		System.out.print("请输入当前利率:");
		float rate=scanner.nextFloat();
		float sum=1;
		for(int i=1;i<=year;i++){
			sum=sum*(1+rate);
		}
		System.out.print("你的复利终值为:"+money*sum+"元");
		
//		//单利计算：本息＝本金×利率×存期
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("请输入你要存款的本金:");
//		double money=scanner.nextDouble();
//		System.out.print("请输入你的存期:");
//		int year=scanner.nextInt();
//		System.out.print("请输入当前利率:");
//		float rate=scanner.nextFloat();
//		float interest=0;
//		interest=(float) (money*year*rate);
//		System.out.print("你的单利本息为:"+interest+"元");
		
		//本金=本息和÷（1+存期*利率）
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("请输入你的本息和:");
//		double sum=scanner.nextDouble();
//		System.out.print("请输入你的存期:");
//		int year=scanner.nextInt();
//		System.out.print("请输入当前利率:");
//		float rate=scanner.nextFloat();
//		float money=0;
//		money=(float) (sum/(1+year*rate));
//		System.out.print("你所需存入的本金为:"+money+"元");
	}

}
