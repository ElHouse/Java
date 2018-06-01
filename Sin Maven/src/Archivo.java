import java.io.File;
import java.util.Random;
import java.io.*;

public class Archivo {


	 public static void main(String[] args)
	    {
	        FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("C:\\Users\\adrian.canton\\workspaceEstudio\\SparkJavaNoMaven\\people.json");
	            pw = new PrintWriter(fichero);
	            String base64 = "\"YXNkZGRCYXNlNjQgZW5jb2Rpbmcgc2NoZW1lcyBhcmUgY29tbW9ubHkgdXNlZCB3aGVuIHRoZXJlIGlzIGEgbmVlZCB0byBlbmNvZGUgYmluYXJ5IGRhdGEgdGhhdCBuZWVkcyBiZSBzdG9yZWQgYW5kIHRyYW5zZmVycmVkIG92ZXIgbWVkaWEgdGhhdCBhcmUgZGVzaWduZWQgdG8gZGVhbCB3aXRoIHRleHR1YWwgZGF0YS4gVGhpcyBpcyB0byBlbnN1cmUgdGhhdCB0aGUgZGF0YSByZW1haW5zIGludGFjdCB3aXRob3V0IG1vZGlmaWNhdGlvbiBkdXJpbmcgdHJhbnNwb3J0LiBCYXNlNjQgaXMgdXNlZCBjb21tb25seSBpbiBhIG51bWJlciBvZiBhcHBsaWNhdGlvbnMgaW5jbHVkaW5nIGVtYWlsIHZpYSBNSU1FLCBhbmQgc3RvcmluZyBjb21wbGV4IGRhdGEgaW4gWE1MLg==\"";
	    		String linea = 
	    				"{ \"numero_cuenta\":\"xxx0\",  \"referencia_banco\": \"xxx2\", \"referencia_banco_ext\":\"xxx1\","
	    				+ "\"base64_1\":"+base64+", \"base64_2\":"+base64+", \"base64_3\":"+base64+", \"numero_cuenta_bene\":\"asdasdasd\","
	    			    + "\"rfc_bancario\":\"10pos\", \"rfc_bancario_ext\":\"10pos\", \"numero_cuenta_ext\":\"askljd\", \"campoStr1\":\"xxx10\","
	    			    + "\"campoStr2\":\"xxx11\", \"campoStr3\":\"xxx12\", \"campoStr4\":\"xxx13\", \"campoNumerico\":0, \"fecha\":\"10/10/2017\", \"iva\": 0.16,  \"importe\": "  ;

	    		Random rand = new Random();
	    		Random rand2 = new Random(10000);
	    		
	            for (int i = 1; i <= 100000; i++){
	            	
	            	int  n = rand.nextInt(100000);
	            	float  d = rand2.nextFloat()+n;
//	            	System.out.println("->"+n);
//	            	System.out.println(d);
	            	
	            	linea.replaceAll("0.0", d+"");
	            	pw.println(linea + d+",\"age\":"+ i + "}");

	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
	 
}
