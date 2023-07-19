package f.format;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class MessageFormatSample {

	public static void main(String[] args) {
		MessageFormatSample sample = new MessageFormatSample();
		sample.stringSample("이상민", "아임닭", 10);
		System.out.println();
		sample.stringBuilderSample("이상민", "아임닭", 10);
		System.out.println();
		sample.messageFormatSample("이상민", "아임닭", 10);
		
		System.out.println();
		sample.messageFormatSample("이상민", 123467);
	}
	
	public void stringSample(String customer, String product, int days) {
		String message = customer + "님 구매해 주셔서 감사합니다. \n구매하신 \""
				+ product
				+ "\"는 "
				+ days
				+ "일내에 배송 될 것입니다.\n"
				+ "궁금하신 사항은 문의하시기 바랍니다.";
		System.out.println(message);
				
	}
	
	public void stringBuilderSample(String customer, String product, int days) {
		StringBuilder str = new StringBuilder();
		str.append(customer).append("님 구매해 주셔서 감사합니다. \n구매하신 \"").append(product);
		str.append("\"는 ").append(days).append("일내에 배송 될 것입니다.\n");
		str.append("궁금하신 사항은 문의하시기 바랍니다.");
		System.out.println(str.toString());
	}
	
	public void messageFormatSample(String customer, String product, int days) {
		String format = "{0}님 구매해 주셔서 감사합니다.\n"
				+ "구매하신 \"{1}\"는 {2}일내에 배송될 것입니다.\n"
				+ "궁금하신 사항은 문의하시기 바랍니다.";
		String result = MessageFormat.format(format, customer, product, days);
		System.out.println(result);
	}
	
	public void messageFormatSample(String customer, int price) {
		//DecimalFormat numFormat = new DecimalFormat("#,##0");
		//String totalPrice = numFormat.format(price);
		String format = "{0}님이 구매하신 총액은 {1,number,#,###.00}원 입니다.";
		String result = MessageFormat.format(format, customer, price);
		System.out.println(result);
	}
	
	

}
