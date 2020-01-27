
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ama1 {

	TrieNode root = null;
	
	public ArrayList<String> popularNToys(int numToys, int topToys, List<String> toys, int numQuotes, List<String> quotes) {
	
		ArrayList<String> answer = new ArrayList<>(topToys);
		
		root = new TrieNode();
		
		//create a Trie of toys
		for(String toy: toys) {
			insertTrie(toy.toLowerCase());
		}
		
		for(String quote: quotes) {
			
			String[] split = quote.split(" ");
			
			for(String str: split) {
				
				//this string would have all the word with out any special characters like (, ' !)
				String aux  = null;
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i<str.length(); i++) {
					
					if(65 <= str.charAt(i) && str.charAt(i) <= 90 ) {
						sb.append(str.charAt(i));
					}else if(97 <= str.charAt(i) && str.charAt(i) <= 122 ) {
						sb.append(str.charAt(i));
					}
				}
				
				aux = sb.toString().toLowerCase();
				
//				System.out.println("aux>"+aux);
				
				searchAndCouting(aux);
			}
			
		}
		
		Map<String, Integer> maxMap = new HashMap<>();
		for(String toy: toys) {
			maxMap.put(toy.toLowerCase(),getSearchCount(toy.toLowerCase()));
		}
		
		
		int maxAux = -1;
		List<String> tieElements = new ArrayList<>();
		
		for(int i =0 ; i<topToys; i++) {
			
			for(String toy: maxMap.keySet()) {
				
//				System.out.println(toy+"-"+getSearchCount(toy));
				
				int count = maxMap.get(toy);
				//alphabetical order 
				if(maxAux == count) {
					tieElements.add(toy);
				}else if(maxAux < count) {
					maxAux = count;
					tieElements = new ArrayList<>();
					tieElements.add(toy);
				}
				
			}
			
			if(tieElements.size() == 1) {
			
//				System.out.println("---------------case 1");
				answer.add(tieElements.get(0));
				maxMap.remove(tieElements.get(0));
				
//				System.out.println("maxMap size>"+maxMap.size());
//				element = null;
				tieElements = new ArrayList<>();
				maxAux = -1;
			}else{
				

//				System.out.println("-------------case 2");
				Collections.sort(tieElements);
				
				if(answer.isEmpty()) {
//					System.out.println("isempy");
					answer.addAll(tieElements);
				}else {
					
					String last = answer.get(answer.size()-1);
					
					for(String s : tieElements) {
						if(last.compareTo(s) < 0) {
							answer.add(s);
							maxMap.remove(tieElements.get(0));
							
//							System.out.println("maxMap size>"+maxMap.size());
//							element = null;
							tieElements = new ArrayList<>();
							maxAux = -1;
							break;
						}
								
					}
					
				}
			}

		}
		
		System.out.println("----------final");
				
		ArrayList<String> answerFinal = new ArrayList<>(topToys);
		
		for (int i = 0; i < topToys; i++) {
			answerFinal.add(answer.get(i));
		}
		
		answerFinal.forEach(System.out::println);
		return answerFinal;
	}

	public void insertTrie(String word) {

		TrieNode aux = root;
		for (int i = 0; i < word.length(); i++) {
			if (aux.children[word.charAt(i) - 'a'] == null) {
				aux.children[word.charAt(i) - 'a'] = new TrieNode();
			}
			aux = aux.children[word.charAt(i) - 'a'];
		}
		aux.isAWord = true;
	}

	public void searchAndCouting(String word) {

		TrieNode aux = root;
		for (int i = 0; i < word.length(); i++) {

			if (aux.children[word.charAt(i) - 'a'] == null) {
				return ;
			}
			aux = aux.children[word.charAt(i) - 'a'];
		}
		
		if(aux.isAWord) aux.count +=1;
	}
	
	public int getSearchCount(String word) {

		TrieNode aux = root;
		for (int i = 0; i < word.length(); i++) {

			aux = aux.children[word.charAt(i) - 'a'];
		}
		
		return aux.count;
	}

	class TrieNode {

		int count = 0;
		boolean isAWord;
		TrieNode[] children = new TrieNode[26];

		TrieNode() {
			isAWord = false;
		}
	}
	
	
	
//	@Test
	public void case1() {
		
		int numToys = 6;
		int topToys = 2;
		List<String> toys = new ArrayList<>();
		toys.add("elmo");
		toys.add("elsa");
		toys.add("legos");
		toys.add("drones");
		toys.add("tables");
		toys.add("warcraft");
		
		
		int numQuotes = 6;
		List<String> quotes = new ArrayList<>();
		quotes.add("Elmo is the hottest yoy of the seasson elmo,");
		quotes.add("the new elmo dolls are super high qulity");
		quotes.add("expect the Elsa dolls to be very popular this year");
		quotes.add("ELsa and Elmo are the toys i'll be byin for my kids");
		quotes.add("for parente of older kids, legos, somethe drones tables ");
		quotes.add("Warcraft is sloy risin un popular oh the holyda warcraft warcraft warcraft warcraft warcraft warcraft");
		
		popularNToys(numToys, topToys, toys, numQuotes, quotes);


		
	}
	
	
	@Test
	public void case2() {
		
		int numToys = 5;
		int topToys = 2;
		List<String> toys = new ArrayList<>();
		toys.add("anac");
		toys.add("beta");
		toys.add("deta");
		
		
		int numQuotes = 1;
		List<String> quotes = new ArrayList<>();
		quotes.add("anac anac beta beta deta deta");

		popularNToys(numToys, topToys, toys, numQuotes, quotes);


		
	}
}
