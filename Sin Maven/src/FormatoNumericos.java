import java.text.NumberFormat;
import java.util.Locale;

public class FormatoNumericos {

	
	public static void main(String[] args) throws Exception {

		String numero  = "0.2379";
		
//		numero= numero.replaceAll(",", "");
		
		System.out.println("original>"+numero);
				
		
		NumberFormat format = NumberFormat.getInstance(Locale.US);
		Number number = format.parse(numero);
		
		Double dou = new Double(number.toString());
		
		System.out.println("duo>"+dou);
		System.out.println(number);


	}

}
