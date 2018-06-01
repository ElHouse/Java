import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.io.*;

public class ArchivoGranVolumen {

	
	public static void main(String[] args) throws Exception {

		CIEDinamico();
		SITDinamico();
		MOVDinamico();
//		CIE();
//		MOVI();
//		SIT();
//		MOV2();
//		COM();
	}
	
	
	static void COM() throws Exception{
		
		Long inicio = System.currentTimeMillis();
//		byte[] buffer = "".getBytes(); 
		String cadena   = "50050026|34684893|SECRETARIA DE EDUCACJIMENEZ             PEREZ               |ADMIN1  |100|PAGO INTERNACIONAL    |USD|                  1.00|PRUEBA                |2017-12-07|0102606364                           |GOBIERNO AMI GOBIERNJIMENEZ             PEREZ               |BICEXTRANJEROUSD000002               |12345678901234567890123456789012345                         |                                   |BSUISESSXXX|CREDIT AGRICOLE CORPORATE AND INVES|REGERINGSGATAN 38                  |13|0000469582              |USD|                  1.00|        18.6420|                                   |MOLINO                             |LOS ANGELES CA                     |USA                                |USD|                  1.00|2382446|I6F2201712051710380004007120|100|OPERADO |CREO   |ADMIN1  |--0|2017-12-05|FIRMO  |ADMIN1  |100|2017-12-05|       |        |000|          |       |        |000|          |       |        |000|          |\r\n";
		String cadena1  = "50050026|34684893|SECRETARIA DE EDUCACJIMENEZ             PEREZ               |ADMIN1  |100|PAGO INTERNACIONAL    |USD|                  1.00|PRUEBA                |2017-12-07|0108941068                           |GOBIERNO AMI GOBIERNJIMENEZ             PEREZ               |BICEXTRANJEROUSD000002               |12345678901234567890123456789012345                         |                                   |BSUISESSXXX|CREDIT AGRICOLE CORPORATE AND INVES|REGERINGSGATAN 38                  |13|0000469582              |USD|                  1.00|        18.6420|                                   |MOLINO                             |LOS ANGELES CA                     |USA                                |USD|                  1.00|2382446|I6F2201712051710380004007120|100|OPERADO |CREO   |ADMIN1  |--0|2017-12-05|FIRMO  |ADMIN1  |100|2017-12-05|       |        |000|          |       |        |000|          |       |        |000|          |\r\n";
		String cadena2  = "50050026|34684893|SECRETARIA DE EDUCACJIMENEZ             PEREZ               |ADMIN1  |100|PAGO INTERNACIONAL    |USD|                  1.00|PRUEBA                |2017-12-07|0110041084                           |GOBIERNO AMI GOBIERNJIMENEZ             PEREZ               |BICEXTRANJEROUSD000002               |12345678901234567890123456789012345                         |                                   |BSUISESSXXX|CREDIT AGRICOLE CORPORATE AND INVES|REGERINGSGATAN 38                  |13|0000469582              |USD|                  1.00|        18.6420|                                   |MOLINO                             |LOS ANGELES CA                     |USA                                |USD|                  1.00|2382446|I6F2201712051710380004007120|100|OPERADO |CREO   |ADMIN1  |--0|2017-12-05|FIRMO  |ADMIN1  |100|2017-12-05|       |        |000|          |       |        |000|          |       |        |000|          |\r\n";
		String cadena3  = "50050026|34684893|SECRETARIA DE EDUCACJIMENEZ             PEREZ               |ADMIN1  |100|PAGO INTERNACIONAL    |USD|                  1.00|PRUEBA                |2017-12-07|0178304920                           |GOBIERNO AMI GOBIERNJIMENEZ             PEREZ               |BICEXTRANJEROUSD000002               |12345678901234567890123456789012345                         |                                   |BSUISESSXXX|CREDIT AGRICOLE CORPORATE AND INVES|REGERINGSGATAN 38                  |13|0000469582              |USD|                  1.00|        18.6420|                                   |MOLINO                             |LOS ANGELES CA                     |USA                                |USD|                  1.00|2382446|I6F2201712051710380004007120|100|OPERADO |CREO   |ADMIN1  |--0|2017-12-05|FIRMO  |ADMIN1  |100|2017-12-05|       |        |000|          |       |        |000|          |       |        |000|          |\r\n";

		byte[] buffer = cadena.getBytes();
		int number_of_lines = 10000;

		FileChannel rwChannel = new RandomAccessFile("D:\\temp\\MMNIT_D02_20180213_AGPIN000014.TXT", "rw").getChannel();
		ByteBuffer wrBuf     = rwChannel.map(FileChannel.MapMode.READ_WRITE, 0, buffer.length * number_of_lines);

		for (int i = 0; i < number_of_lines; i++){
			
			if (i<40000){
				byte[] buffer2 = cadena.getBytes();
			    wrBuf.put(buffer2);
			}
			else if (i<80000){
				byte[] buffer2 = cadena1.getBytes();
			    wrBuf.put(buffer2);
			}
			else if (i<120000){
				byte[] buffer2 = cadena2.getBytes();
			    wrBuf.put(buffer2);
			}
			else{
				byte[] buffer2 = cadena3.getBytes();
			    wrBuf.put(buffer2);
			}
		    
		}
		rwChannel.close();
		Long fin  = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	
	static void SIT() throws Exception{
		
		Long inicio = System.currentTimeMillis();
//0007417522018-01-02005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638
//		 000605999
		
		//25,000
		String cadena  = "0006059992018-03-12005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638NHD0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          0134775880D0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          \r\n";
		//29,999
		String cadena1 = "0006061382018-03-28005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638NHD0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          0134775880D0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          \r\n";
		//30,000
		String cadena2 = "0006061462018-04-06005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638NHD0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          0134775880D0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          \r\n";
		//50,000
		String cadena3 = "0006062272018-03-12005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638NHD0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          0134775880D0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          \r\n";
		//100,000
		String cadena4 = "0008002952018-03-28005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638NHD0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          0134775880D0030702GOBIERNO AMI GOBIERN JIMENEZ PEREZ                          \r\n";

		byte[] buffer = cadena.getBytes();
		int number_of_lines = 235000;

		FileChannel rwChannel = new RandomAccessFile("D:\\temp\\MMNIT_D02_20180516_SIPAG144014.TXT", "rw").getChannel();
		ByteBuffer wrBuf     = rwChannel.map(FileChannel.MapMode.READ_WRITE, 0, buffer.length * number_of_lines);

		for (int i = 0; i < number_of_lines; i++){
			
			if (i<25000){
				byte[] buffer2 = cadena.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<54999){
				byte[] buffer2 = cadena1.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<84999){
				byte[] buffer2 = cadena2.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<134999){
				byte[] buffer2 = cadena3.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<234999){
				byte[] buffer2 = cadena4.getBytes();
			    wrBuf.put(buffer2);
			}else {
				
			}
		    
		}
		rwChannel.close();
		Long fin  = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	
	static void MOVI()throws Exception{ //importes dinamicos
		Long inicio = System.currentTimeMillis();
//		byte[] buffer = "".getBytes();
//		String cadena = "03/02/2017|18/01/2017|0980|ED74|8000017213|000|304|-|0000000000000.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";
		String cadena = "03/02/2017|18/01/2017|0980|ED74|0178051682|000|304|-|XXXXXXXXXXXXX.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";
		String partaA = "03/02/2017|18/01/2017|0980|ED74|0178051682|000|304|-|";
		String partaB = ".00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";
				
		
		byte[] buffer = cadena.getBytes();
		int number_of_lines = 10000;

		FileChannel rwChannel = new RandomAccessFile("D:\\temp\\MMNIT_D02_20180213_BGMOV241714.TXT", "rw").getChannel();
		ByteBuffer wrBuf      = rwChannel.map(FileChannel.MapMode.READ_WRITE, 0, buffer.length * number_of_lines);
		
		for (int i = 0; i < number_of_lines; i++){
			String a = String.format("%013d", i);
//			System.out.println(a);
//			cadena = cadena.replaceAll("XXXXXXXXXXXXX", a);
//			System.out.println("->"+cadena);
			String completo = partaA+a+ partaB;
//			System.out.println(completo);
			byte[] buffer2 = completo.getBytes();

		    wrBuf.put(buffer2);
		}
		rwChannel.close();
		Long fin  = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	
	static void MOV2() throws Exception {//MULTIPLES CUENTAS
		
		Long inicio = System.currentTimeMillis();
//		byte[] buffer = "".getBytes(); 
		String cadena  = "03/02/2017|18/01/2017|0980|ED74|0102606364|000|304|-|0000000000000.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";
		String cadena1 = "03/02/2017|18/01/2017|0980|ED74|0178304920|000|304|-|0000000000000.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";
		String cadena2 = "03/02/2017|18/01/2017|0980|ED74|2700000035|000|304|-|0000000000000.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|\r\n";

		byte[] buffer = cadena.getBytes();
		int number_of_lines = 10000;

		FileChannel rwChannel = new RandomAccessFile("D:\\temp\\MMNIT_D02_20180213_BGMOV11101.TXT", "rw").getChannel();
		ByteBuffer wrBuf     = rwChannel.map(FileChannel.MapMode.READ_WRITE, 0, buffer.length * number_of_lines);

		for (int i = 0; i < number_of_lines; i++){
			
			if (i<40000){
				byte[] buffer2 = cadena.getBytes();
			    wrBuf.put(buffer2);
			}
			else if (i<80000){
				byte[] buffer2 = cadena1.getBytes();
			    wrBuf.put(buffer2);
			}
			else{
				byte[] buffer2 = cadena2.getBytes();
			    wrBuf.put(buffer2);
			}
		    
		}
		rwChannel.close();
		Long fin  = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	

	static void MOVDinamico() {
		String header = "fecha_operacion|fecha_valor|centro_actividad|transaccion_original|cuenta|numero_cheque|codigo|signo|importe|numero_movimiento|terminal_origen|hora|concepto|referencia|observaciones|usuario|divisa|producto|subproducto|codigo_razon_social|origen_movimiento|fecha_contable";
		//0007417522018-01-02005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638
//03/02/2017|18/01/2017|0980|ED74|8000017213|000|304|-|0000000000000.00|000001357|EDPE|10:59|                         |               |215 12824787061 052318 LIQ ABONO CTA D01|ED2C0066|MXP|27|0201|F|BTS                                               |03/02/2017|

		List<String> convenios = new ArrayList<>();
		convenios.add("000605991");
		convenios.add("000605992");
		convenios.add("000605993");
		
		List<String> observaciones = new ArrayList<>();
		observaciones.add("T31");
		observaciones.add("T32");
		observaciones.add("T21");
		observaciones.add("T65");
		
		Map<String,String> mapa = new HashMap<>();
		mapa.put("000605991", "BIMBO ");
		mapa.put("010605992", "GAMESA ");
		mapa.put("020605993", "MARINELA ");
		
		Long guiaCIE = 5460000L;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
				
		NumberFormat formatter = new DecimalFormat("0000000000000.00");
		int initialYear = 0;

		for(int d=91; d<274; d++) {
			
			Calendar calendar = new GregorianCalendar(2019,0,d);
			Random random = new Random();	
			
			int mes = calendar.get(Calendar.MONTH)+1;
			int year = calendar.get(Calendar.YEAR);
			
			if(!(initialYear == year)){
				
				for(int i=1; i<13; i++) {
					
					String path = "D:\\temp\\cargaAnual\\MOV\\"+year+"\\"+i;
					File file = new File(path);
					file.mkdirs();
				}
				initialYear = year;
			}
			
			String archivo = "D:\\temp\\cargaAnual\\MOV\\"+year+"\\"+mes+"\\MMNIT_D02_"+ sdf2.format(calendar.getTime())+"_BGMOV00000.csv";

			
	        try(FileWriter fichero = new FileWriter(archivo);
	            PrintWriter pw    =  new PrintWriter(fichero); ) {
//	        	pw.print(header+"\n");

	        	for(int r=0; r<30000; r++) {
	        		
	        		String fecha_operacion = sdf.format(new GregorianCalendar(2019,0,d).getTime());
	    			String fecha_valor     = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			String fecha_contable  = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			
	    			BigDecimal monto_efectivo     = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 
	    			BigDecimal monto_ChqBancomer  = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 			
	    			BigDecimal monto_total        = new BigDecimal("0").add(monto_efectivo).add(monto_ChqBancomer);    		
		        	
	    			String convenio = convenios.get((int) Math.floor(Math.random()*(convenios.size())));
	    			String observacion = observaciones.get((int) Math.floor(Math.random()*(observaciones.size())));
	    			
	    			StringBuilder cadena = new StringBuilder();
	    			cadena.append(fecha_operacion).append("|").//fecha_operacion
	    				   append(fecha_valor).append("|").//fecha_valor
	    				   append("0998").append("|").//centro_actividad
	    				   append("MIRB").append("|").//transaccion_original
	    				   append(convenio).append("|").//cuenta
	    				   append("000").append("|").//numero_cheque
	    				   append("997").append("|").//codigo
	    				   append("+").append("|").//signo
	    				   append(formatter.format(monto_efectivo.doubleValue())).append("|").//importe
	    				   append(String.format("%09d", guiaCIE)).append("|").//numero_movimiento
	    				   append("EI28").append("|").//terminal_origen
	    				   append("11:55").append("|").//hora
	    				   append("20000000252010").append("|").//concepto
	    				   append("DISPERSION").append("|").//referencia
	    				   append("20000000252010                       ").append(observacion).append("|").//observaciones
	    				   append("C0000026").append("|").//usuario
	    				   append("MXP").append("|").//divisa
	    				   append("01").append("|").//producto
	    				   append("0101").append("|").//subproducto
	    				   append("M").append("|").//codigo_razon_social
	    				   append("CANAL ELECTRONICO                                 ").append("|").//origen_movimiento
	    				   append(fecha_contable).append("\n")//fecha_contable 				   
	    			     ;
	    			
		    		guiaCIE++;
		                			    		
//		    		asunto     fecha     #    monto_1    monto_2   monto_3    fv0   fv1   fv2   fp0	  fp1 fp2   MTPV   OPIS    GTP
//		    		000605991|15/05/18|30000|1231231.13|123123123|1323123123|10000|25000|5000|10000|25000|5000|0001  |25000  |5000 |
		    		
		    		
		    		
		    		pw.print(cadena);
	        	}
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 			
		}
	}	
	
	
	static void SITDinamico() throws Exception {

		String seprador = "";// | 
		String header = "convenio_sit|fecha_operacion|folio_operacion|referencia_sit|clave_tercero|indicador_servicio|numero_dias|fecha_valor|divisa|monto_efectivo|monto_chqbancomer|monto_chqotrosbancos|monto_chremisiones|monto_total|comision|iva|numero_dedocumento|disponibilidad|sucursalcuenta_abono|cuenta_abono|resultado|origen_documento|canal_pago|fecha_proceso|plaza_pagador|sucursal_pagador|num_ficha|tipo_cuenta|sucursal_ctacargo|cuenta_cargo|sucursal_ctapuente|cuenta_puente|estado_valor|cuenta_interbancaria|tarjeta_credito|terminal|usuario|fecha_hora";
		//0007417522018-01-02005241733PRUEBAGBP1E                                       PROVEEDOR600057                                   O  2018-01-02USD            13.44            0.00            0.00            0.00           13.44            0.00            0.00  0EF       233710 CO PINT0001-01-011800998      040     0134775880                                                    LINEA   EI7C83422018-01-02-15.20.55.243638

		List<String> convenios = new ArrayList<>();
		convenios.add("000605991");
		convenios.add("000605992");
		convenios.add("000605993");
		
		List<String> canales = new ArrayList<>();
		canales.add("MTPV");
		canales.add("OPIS");
		canales.add("PTC ");
		canales.add("GTP ");
		
		Map<String,String> mapa = new HashMap<>();
		mapa.put("000605991", "BIMBO ");
		mapa.put("010605991", "GAMESA ");
		mapa.put("020605991", "MARINELA ");
		
		Long guiaCIE = 5460000L;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
				
		NumberFormat formatter = new DecimalFormat("0000000000000.00");
		int initialYear = 0;

		for(int d=91; d<274; d++) {
			
			Calendar calendar = new GregorianCalendar(2019,0,d);
			Random random = new Random();
			
			int mes = calendar.get(Calendar.MONTH)+1;
			int year = calendar.get(Calendar.YEAR);
			
			if(!(initialYear == year)){
				
				for(int i=1; i<13; i++) {
					
					String path = "D:\\temp\\cargaAnual\\SIT\\"+year+"\\"+i;
					File file = new File(path);
					file.mkdirs();
				}
				initialYear = year;
			}
			
			String archivo = "D:\\temp\\cargaAnual\\SIT\\"+year+"\\"+mes+"\\MMNIT_D02_"+ sdf2.format(calendar.getTime())+"_SIPAG00000.csv";

			
	        try(FileWriter fichero = new FileWriter(archivo);
	            PrintWriter pw    =  new PrintWriter(fichero); ) {
	        	
//	        	pw.print(header+"\n");
	        	for(int r=0; r<30000; r++) {
	        		
	        		String fecha_operacion = sdf.format(new GregorianCalendar(2019,0,d).getTime());
	    			String fecha_valor     = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			String fecha_proceso   = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			
	    			BigDecimal monto_efectivo     = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 
	    			BigDecimal monto_ChqBancomer  = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 			
	    			BigDecimal monto_total        = new BigDecimal("0").add(monto_efectivo).add(monto_ChqBancomer);    		
		        	
	    			String convenio = convenios.get((int) Math.floor(Math.random()*(convenios.size())));
	    			String canal    = canales.get((int) Math.floor(Math.random()*(canales.size())));
	    			
	    			StringBuilder cadena = new StringBuilder();
	    			cadena.append(convenio).append(seprador).//convenio_SIT
	    				   append(fecha_operacion).append(seprador).//fecha operacion
	    				   append(String.format("%09d", guiaCIE)).append(seprador).//folio_operación
	    				   append("PRUEBAGBP1E                                       ").append(seprador).//referencia_sit
	    				   append("PROVEEDOR600057                                   ").append(seprador).//clave_tercero
	    				   append("T").append(seprador).//indicador_servicio
	    				   append("00").append(seprador).//numero de dias
	    				   append(fecha_valor).append(seprador).//fecha_valor
	    				   append("MXP ").append(seprador).//Divisa
	    				   append(formatter.format(monto_efectivo.doubleValue())).append(seprador).//monto_efectivo
	    				   append(formatter.format(monto_ChqBancomer.doubleValue())).append(seprador).//monto_ChqBancomer
	    				   append("            0.00").append(seprador).//monto_Chqotrosbancos
	    				   append("            0.00").append(seprador).//monto_Chremisiones
	    				   append(formatter.format(monto_total.doubleValue())).append(seprador).//monto_total
	    				   append("            0.00").append(seprador).//comision
	    				   append("            0.00").append(seprador).//iva
	    				   append("0  ").append(seprador).//numero_dedocumento
	    				   append("EF").append(seprador).//disponibilidad
	    				   append("0095").append(seprador).//sucursalcuenta_abono
	    				   append("0177984707").append(seprador).//cuenta_abono*
	    				   append("CO").append(seprador).//resultado
	    				   append("0").append(seprador).//origen_documento
	    				   append(canal).append(seprador).//canal_pago
	    				   append(fecha_proceso).append(seprador).//fecha_procesos
	    				   append("022").append(seprador).//Plaza_pagador
	    				   append("6607").append(seprador).//sucursal_pagador
	    				   append("629277 ").append(seprador).//num_ficha
	    				   append("CHQ").append(seprador).//tipo_cuenta
	    				   append("361 ").append(seprador).//sucursal_ctacargo
	    				   append("0178851700").append(seprador).//cuenta_cargo
	    				   append("0095").append(seprador).//sucursal_ctapuente
	    				   append("0131368249").append(seprador).//Cuenta_puente
	    				   append("0 ").append(seprador).//estado_valor
	    				   append("4772142170584294").append("|").//tarjeta_credito
	    				   append("002060008376066161  ").append(seprador).//cuenta_interbancaria
	    				   append("VENT    ").append(seprador).//terminal
	    				   append("BBVUSER ").append(seprador).//usuario
	    				   append(fecha_operacion).append("-12.48.26.443442").append("\n")//fecha_hora  				   
	    			     ;
	    			
		    		guiaCIE++;
		                			    		
//		    		asunto     fecha     #    monto_1    monto_2   monto_3    fv0   fv1   fv2   fp0	  fp1 fp2   MTPV   OPIS    GTP
//		    		000605991|15/05/18|30000|1231231.13|123123123|1323123123|10000|25000|5000|10000|25000|5000|0001  |25000  |5000 |
		    		
		    		
		    		
		    		pw.print(cadena);
	        	}
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 			
		}
	}	
	
	static void CIEDinamico() throws Exception {
		
		String header = "convenio_cie|fecha_operacion|guia_cie|referencia_cie|concepto_cie|indicador_servicio|numero_dias|fecha_valor|divisa|monto_efectivo|monto_chqbancomer|monto_chqotrosbancos|monto_remesas|monto_total|comision|iva|numero_dedocumentos|disponibilidad|sucursalcuenta_abono|cuenta_abono|resultado|origen_documento|canal_pago|fecha_proceso|plaza_pago|sucursal|num_ficha|tipo_cuenta|sucursal_ctacargo|cuenta_cargo|sucursal_ctapuente|cuenta_puente|estado_valor|cuenta_interbancaria|tarjeta_credito|terminal|usuario|fecha_hora";
//		String cadena  = "000605999|2018-05-01|0178062560|00000000728810179169                              |AVON COSMETICS S DE RLECB0                        |T|01|2016-06-20|MXP |0000000000795.00|0000000000000.00|0000000000000.00|0000000000000.00|0000000000795.00|0000000000000.00|0000000000000.00|  0|EF|0095|0453901569|CO|0|MTPV|2016-06-21|180|0172|0782970|CHQ|    |0195407663|    |0131368249|  |                    |                |MTPV    |EI4C1000|2016-06-20-12.48.26.443442|\r\n";

		List<String> convenios = new ArrayList<>();
		convenios.add("000605991");
		convenios.add("000605992");
		convenios.add("000605993");
		
		List<String> canales = new ArrayList<>();
		canales.add("MTPV");
		canales.add("OPIS");
		canales.add("PTC ");
		canales.add("GTP ");
		
		Map<String,String> mapa = new HashMap<>();
		mapa.put("000605991", "BIMBO ");
		mapa.put("010605991", "GAMESA ");
		mapa.put("020605991", "MARINELA ");
		
		Long guiaCIE = 5460000L;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
				
		NumberFormat formatter = new DecimalFormat("0000000000000000.00");

		int initialYear = 0;
		
		for(int d=91; d<274; d++) {
			
			Calendar calendar = new GregorianCalendar(2019,0,d);
			Random random = new Random();
			
			int mes = calendar.get(Calendar.MONTH)+1;
			int year = calendar.get(Calendar.YEAR);
			
			if(!(initialYear == year)){
				
				for(int i=1; i<13; i++) {
					
					String path = "D:\\temp\\cargaAnual\\CIE\\"+year+"\\"+i;
					File file = new File(path);
					file.mkdirs();
				}
				initialYear = year;
			}
			
			String archivo = "D:\\temp\\cargaAnual\\CIE\\"+year+"\\"+mes+"\\MMNIT_D02_"+ sdf2.format(calendar.getTime())+"_CICIE00000.csv";

			
	        try(FileWriter fichero = new FileWriter(archivo);
	            PrintWriter pw    =  new PrintWriter(fichero); ) {
	        	
//	        	pw.print(header+"\n");
	        	for(int r=0; r<30000; r++) {
	        		
	        		String fecha_operacion = sdf.format(new GregorianCalendar(2019,0,d).getTime());
	    			String fecha_valor     = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			String fecha_proceso   = sdf.format(new GregorianCalendar(2019,0,d+random.nextInt(3)).getTime());
	    			
	    			BigDecimal monto_efectivo = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 
	    			BigDecimal monto_remesas  = new BigDecimal(formatter.format(new Random().nextDouble()*100000)); 			
	    			BigDecimal monto_total    = new BigDecimal("0").add(monto_efectivo).add(monto_remesas);    		
		        	
	    			String convenio = convenios.get((int) Math.floor(Math.random()*(convenios.size())));
	    			String canal    = canales.get((int) Math.floor(Math.random()*(canales.size())));
	    					    		
		    		StringBuilder cadena = new StringBuilder();
	    			cadena.append(convenio).append("|").//convenio_cie
	    				   append(fecha_operacion).append("|").//fecha_operacion
	    				   append("002385174").append("|").//guia_cie
	    				   append(String.format("%020d", guiaCIE)).append("|").//referencia_cie
	    				   append("COSMETICS S DE                         ").append("|").//concepto_cie
	    				   append("T").append("|").//indicador_servicio*
	    				   append("01").append("|").//numero_dias
	    				   append(fecha_valor).append("|").//fecha_valor
	    				   append("MXP ").append("|").//divisa
	    				   append(formatter.format(monto_efectivo.doubleValue())).append("|").//monto_efectivo
	    				   append("0000000000000.00").append("|").//monto_chqbancomer
	    				   append("0000000000000.00").append("|").//monto_chqotrosbancos
	    				   append(formatter.format(monto_remesas.doubleValue())).append("|").//monto_remesas
	    				   append(formatter.format(monto_total.doubleValue())).append("|").//monto_total*
	    				   append("0000000000000.00").append("|").//comision
	    				   append("0000000000000.00").append("|").//iva
	    				   append("0  ").append("|").//numero_dedocumentos
	    				   append("EF").append("|").//disponibilidad*
	    				   append("0095").append("|").//sucursalcuenta_abono
	    				   append("0453901569").append("|").//cuenta_abono*
	    				   append("CO").append("|").//resultado
	    				   append("0").append("|").//origen_documento
	    				   append(canal).append("|").//canal_pago*
	    				   append(fecha_proceso).append("|").//fecha_proceso*
	    				   append("022").append("|").//plaza_pago
	    				   append("6607").append("|").//sucursal
	    				   append("0782970").append("|").//num_ficha
	    				   append("CHQ").append("|").//tipo_cuenta
	    				   append("    ").append("|").//sucursal_ctacargo
	    				   append("0195407663").append("|").//cuenta_cargo
	    				   append("0095").append("|").//sucursal_ctapuente
	    				   append("0131368249").append("|").//cuenta_puente
	    				   append("0 ").append("|").//estado_valor*
	    				   append("                    ").append("|").//cuenta_interbancaria
	    				   append("                    ").append("|").//tarjeta_credito
	    				   append("MTPV    ").append("|").//terminal
	    				   append("EI4C1000").append("|").//usuario
	    				   append(fecha_operacion).append("-12.48.26.443442").append("\n")//fecha_hora  				   
	    			     ;
		    		
		    		
		    		guiaCIE++;
		                			    		
//		    		asunto     fecha     #    monto_1    monto_2   monto_3    fv0   fv1   fv2   fp0	  fp1 fp2   MTPV   OPIS    GTP
//		    		000605991|15/05/18|30000|1231231.13|123123123|1323123123|10000|25000|5000|10000|25000|5000|0001  |25000  |5000 |
		    		
		    		
		    		
		    		pw.print(cadena);
	        	}
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
		    
			
			
			
		}
	}
	
	static void CIE() throws Exception {
		
		
		Long inicio = System.currentTimeMillis();
		//25,000
		String cadena  = "000593879|2018-03-16|0178062560|00000000728810179169                              |AVON COSMETICS S DE RLECB0                        |T|01|2016-06-20|MXP |0000000000795.00|0000000000000.00|0000000000000.00|0000000000000.00|0000000000795.00|0000000000000.00|0000000000000.00|  0|EF|0095|0453901569|CO|0|MTPV|2016-06-21|180|0172|0782970|CHQ|    |0195407663|    |0131368249|  |                    |                |MTPV    |EI4C1000|2016-06-20-12.48.26.443442|\r\n";
		//35,000
		String cadena1 = "000604542|2018-04-06|0178062560|00000000728810179169                              |AVON COSMETICS S DE RLECB0                        |T|01|2016-06-20|MXP |0000000000795.00|0000000000000.00|0000000000000.00|0000000000000.00|0000000000795.00|0000000000000.00|0000000000000.00|  0|EF|0095|0453901569|CO|0|MTPV|2016-06-21|180|0172|0782970|CHQ|    |0195407663|    |0131368249|  |                    |                |MTPV    |EI4C1000|2016-06-20-12.48.26.443442|\r\n";
		//30,000
		String cadena2 = "000634247|2018-04-06|0178062560|00000000728810179169                              |AVON COSMETICS S DE RLECB0                        |T|01|2016-06-20|MXP |0000000000795.00|0000000000000.00|0000000000000.00|0000000000000.00|0000000000795.00|0000000000000.00|0000000000000.00|  0|EF|0095|0453901569|CO|0|MTPV|2016-06-21|180|0172|0782970|CHQ|    |0195407663|    |0131368249|  |                    |                |MTPV    |EI4C1000|2016-06-20-12.48.26.443442|\r\n";

		
		byte[] buffer = cadena.getBytes();
		int number_of_lines = 100000;

		FileChannel rwChannel = new RandomAccessFile("D:\\temp\\MMNIT_D02_20180516_CICIE111112.TXT", "rw").getChannel();
		ByteBuffer wrBuf     = rwChannel.map(FileChannel.MapMode.READ_WRITE, 0, buffer.length * number_of_lines);

		for (int i = 0; i < number_of_lines; i++){
			
			if (i<25000){
				byte[] buffer2 = cadena.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<55000){
				byte[] buffer2 = cadena1.getBytes();
			    wrBuf.put(buffer2);
			}else if (i<100000){
				byte[] buffer2 = cadena2.getBytes();
			    wrBuf.put(buffer2);
			}else {
				
			}
		    
		}
		rwChannel.close();
		Long fin  = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	
}
