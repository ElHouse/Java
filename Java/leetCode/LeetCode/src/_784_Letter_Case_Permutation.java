import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _784_Letter_Case_Permutation {

	List<String> answer = new ArrayList<>();
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Letter Case Permutation.
//	Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Letter Case Permutation.
	public List<String> letterCasePermutation(String s) {

		if (s == null || s.isEmpty())
			return answer;

		dfs(s.toCharArray(), 0);


		return answer;
	}

	public void dfs(char[] s, int position) {

		if (position == s.length) {
			answer.add(String.valueOf(s));
			return;
		}

		char ascii = s[position];

		if (Character.isLetter(ascii)) {

			char min = Character.toLowerCase(s[position]);
			char may = Character.toUpperCase(s[position]);
			
			s[position] = min;
			dfs(s, position + 1);
			s[position] = may;
			dfs(s, position + 1);
		}else {
			dfs(s, position + 1);
		}		

	}

	@Test
	public void case1() {
		String s = "a1b2";
		assertEquals(4, letterCasePermutation(s).size());
	}

	@Test
	public void case2() {
		String s = "3z4";
		assertEquals(2, letterCasePermutation(s).size());
	}

	@Test
	public void case3() {
		String s = "1234";
		assertEquals(1, letterCasePermutation(s).size());
	}

	@Test
	public void case4() {
		String s = "qwsderfgtyhj";
		assertEquals(4096, letterCasePermutation(s).size());
	}

}
