import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamReadFileMaxQuantity {

	public static void main(String[] args) {
		
		String fileName = "D:\\temp\\cargaAnual\\21052018\\CIE\\2019\\1\\MMNIT_D02_20190101_CICIE00000.TXT";
		long inicio = System.currentTimeMillis();
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

		

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(list.size());
		
		long fin = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
	
}
