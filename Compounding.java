import java.util.Scanner;


public class Compounding {

	public static void main(String[] args) {
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

	}

}
