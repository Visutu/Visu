import java.util.Scanner;


public class Compounding {

	public static void main(String[] args) {
		//�������㣺�ܶ�����(1+����)^����
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
		
//		//�������㣺��Ϣ����������ʡ�����
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("��������Ҫ���ı���:");
//		double money=scanner.nextDouble();
//		System.out.print("��������Ĵ���:");
//		int year=scanner.nextInt();
//		System.out.print("�����뵱ǰ����:");
//		float rate=scanner.nextFloat();
//		float interest=0;
//		interest=(float) (money*year*rate);
//		System.out.print("��ĵ�����ϢΪ:"+interest+"Ԫ");
		
		//����=��Ϣ�͡£�1+����*���ʣ�
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("��������ı�Ϣ��:");
//		double sum=scanner.nextDouble();
//		System.out.print("��������Ĵ���:");
//		int year=scanner.nextInt();
//		System.out.print("�����뵱ǰ����:");
//		float rate=scanner.nextFloat();
//		float money=0;
//		money=(float) (sum/(1+year*rate));
//		System.out.print("���������ı���Ϊ:"+money+"Ԫ");
	}

}
