package f.format;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class MessageFormatSample {

	public static void main(String[] args) {
		MessageFormatSample sample = new MessageFormatSample();
		sample.stringSample("�̻��", "���Ӵ�", 10);
		System.out.println();
		sample.stringBuilderSample("�̻��", "���Ӵ�", 10);
		System.out.println();
		sample.messageFormatSample("�̻��", "���Ӵ�", 10);
		
		System.out.println();
		sample.messageFormatSample("�̻��", 123467);
	}
	
	public void stringSample(String customer, String product, int days) {
		String message = customer + "�� ������ �ּż� �����մϴ�. \n�����Ͻ� \""
				+ product
				+ "\"�� "
				+ days
				+ "�ϳ��� ��� �� ���Դϴ�.\n"
				+ "�ñ��Ͻ� ������ �����Ͻñ� �ٶ��ϴ�.";
		System.out.println(message);
				
	}
	
	public void stringBuilderSample(String customer, String product, int days) {
		StringBuilder str = new StringBuilder();
		str.append(customer).append("�� ������ �ּż� �����մϴ�. \n�����Ͻ� \"").append(product);
		str.append("\"�� ").append(days).append("�ϳ��� ��� �� ���Դϴ�.\n");
		str.append("�ñ��Ͻ� ������ �����Ͻñ� �ٶ��ϴ�.");
		System.out.println(str.toString());
	}
	
	public void messageFormatSample(String customer, String product, int days) {
		String format = "{0}�� ������ �ּż� �����մϴ�.\n"
				+ "�����Ͻ� \"{1}\"�� {2}�ϳ��� ��۵� ���Դϴ�.\n"
				+ "�ñ��Ͻ� ������ �����Ͻñ� �ٶ��ϴ�.";
		String result = MessageFormat.format(format, customer, product, days);
		System.out.println(result);
	}
	
	public void messageFormatSample(String customer, int price) {
		//DecimalFormat numFormat = new DecimalFormat("#,##0");
		//String totalPrice = numFormat.format(price);
		String format = "{0}���� �����Ͻ� �Ѿ��� {1,number,#,###.00}�� �Դϴ�.";
		String result = MessageFormat.format(format, customer, price);
		System.out.println(result);
	}
	
	

}
