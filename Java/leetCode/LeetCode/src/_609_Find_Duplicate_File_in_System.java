import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class _609_Find_Duplicate_File_in_System {

	public List<List<String>> findDuplicate(String[] paths) {

		
		
		Map<String,List<String>> map = new HashMap<>();
		List<List<String>> answer = new ArrayList<>();
		
		if(paths == null) return answer;
		
		for(String path: paths) {
			
			String[] splited = path.split(" ");
			
			for (int i = 1; i < splited.length; i++) {
				
				StringBuilder sb = new StringBuilder();				
				
				String[] aux = splited[i].split("\\(");
				
				sb.append("(");
				sb.append(aux[1]);
				
				if(map.containsKey(sb.toString())) {
					map.get(sb.toString()).add(splited[0]+"/"+aux[0]);
				}else {
					List<String> list = new ArrayList<>();
					list.add(splited[0]+"/"+aux[0]);
					map.put(sb.toString(),list);
				}
			}
			
		}
		
		map.forEach((k,v)->{
		
			if(v.size() > 1) answer.add(v);
		}) ;
		
		
		return answer;
	}
	
	
	
	@Test
	public void case1() {
		
		
		String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
		assertEquals("{{\"root/a/2.txt\",\"root/c/d/4.txt\",\"root/4.txt\"},{\"root/a/1.txt\",\"root/c/3.txt\"}}", findDuplicate(paths));
	
	}
	
	
}
