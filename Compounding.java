import java.util.Scanner;


public class Compounding {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("��������Ҫ���ı���:");
		double money=scanner.nextDouble();
		System.out.print("�����������Ϣ����:");
		int year=scanner.nextInt();
		System.out.print("�����뵱ǰ����:");
		float rate=scanner.nextFloat();
		float sum=1;
		for(int i=1;i<=year;i++){
			sum=sum*(1+rate);
		}
		System.out.print("��ĸ�����ֵΪ:"+money*sum+"Ԫ");

	}

}
