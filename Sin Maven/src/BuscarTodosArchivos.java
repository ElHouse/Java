import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuscarTodosArchivos {

	
	
	public static void main(String[] args) throws IOException {
		
		try (Stream<Path> paths = Files.walk(Paths.get("D:\\temp\\cargaAnual\\21052018\\CIE"))) {
			List<Path> archivos = paths
					.filter(Files::isRegularFile)
					.collect(Collectors.toList());
			
			archivos.forEach(System.out::println);
			System.out.println(archivos.stream().count());
//			paths
//		        .filter(Files::isRegularFile)
//		        .forEach(System.out::println);
		    
		} 
	}
}
