import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BuscaArchivoExtencion {

	public static final String PATH_JSON_FILES = "C:\\Users\\adrian.canton\\workspaceEstudio\\SparkMicroServicio\\";

	
	public static void main(String[] args) {
		
//		 File dir = new File("C:\\Users\\adrian.canton\\workspaceEstudio\\SparkJavaNoMaven\\people3");
//
//		 File[] fileList =  dir.listFiles(new FilenameFilter() { 
//	                 public boolean accept(File dir, String filename)
//	                      { return filename.endsWith(".csv"); }
//	        } );
//		 
//		 String a = fileList[0].toString();
//		 
//		 System.out.println(a);
		
		saveJSON("people3");
	}
	
	
	public static boolean saveJSON( String directoryName) {
		

		String filePath = findFile(directoryName);
		System.out.println("Archivo Encontrado->"+filePath); 		 
		
		Path sorucetFilePath = Paths.get(filePath);
		Path targetFilePath  = Paths.get("C:\\Users\\adrian.canton\\workspaceEstudio\\SparkMicroServicio\\people.json");

		try {
			Files.move(sorucetFilePath, targetFilePath,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}
	
	public static String findFile(String path) {
			
		 File directory = new File(PATH_JSON_FILES+path);

		 String name = "";
		 File[] fileList =  directory.listFiles(new FilenameFilter() { 
	                 public boolean accept(File dir, String filename)
	                      { return filename.endsWith(".json"); }
	        } );
		 
		 name = fileList[0].toString();
		 System.out.println(name);
		 return name;
	}

}
