import java.util.regex.Pattern;

public class Split {

	
	
	public static void main(String[] args) {
		
		String registro = "50140026|00010243|ALEX WILSON COLDSTREKseina              Jules              1|ADMIN1  |100|CIE3                |                1.00 |001055372                            |000604542                            |MXP|MXP|  JUAN MANUEL GATICA ZUNIGA			  |JUAN MANUEL GATICA ZUNIGA             |2017-11-10|2017-11-10|1803399766          |0000946|55260352049         |PAGO DE CONVENIO CIE|0001314018|711101428140001314023       |100 |OPERADO| 0002000300467  |                1.00 |PAGO DE CONVENIO CIE|CREO |ADMIN1  |---|2017-11-10|FIRMO|ADMIN1  |100|2017-11-10|FIRMO|USR01|100|2017-11-12|FIRMO|USR02|100|2017-11-13|FIRMO|USR01|100|          \r\n" + 
				"";
//				String registro = "50140026|00010243|ALEX WILSON COLDSTREKseina              Jules              1|ADMIN1  |100|CIE3                |                1.00 |001055372                            |000604542                            |MXP|MXP|  JUAN MANUEL GATICA ZUNIGA			  |JUAN MANUEL GATICA ZUNIGA             |2017-11-10|2017-11-10|1803399766          |0000946|55260352049         |PAGO DE CONVENIO CIE|0001314018|711101428140001314023       |100 |OPERADO| 0002000300467  |                1.00 |PAGO DE CONVENIO CIE|CREO |ADMIN1  |---|2017-11-10|FIRMO|ADMIN1  |100|2017-11-10|FIRMO|USR01|100|2017-11-12|FIRMO|USR02|100|2017-11-13|FIRMO|USR01|100|          "; 
		
    	String[] campos = registro.split(Pattern.quote("|"));
    	
    	System.out.println(campos.length);
    	
    	for(int i=0; i<campos.length; i++) {
    		System.out.println(i+"<>"+campos[i]);
    	}

	}
}
