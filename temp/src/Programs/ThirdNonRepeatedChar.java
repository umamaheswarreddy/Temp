package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * How to print 3rd non repeated char from string
 * Input: Preeti
 * Output: t
 *
 * input: preetip
 * Output: i
 */
public class ThirdNonRepeatedChar {

	/**
	 * USING STREAMS
	 *
	 *         String str = "preeti";
	 *         char[] chars = str.toCharArray();
	 *
	 *         List<Character> collect = new String(chars).chars().mapToObj(i -> (char) i).collect(Collectors.toList());
	 *         System.out.println(collect);
	 *
	 *         Optional<Character> first = new String(chars).chars().mapToObj(i -> (char) i).
	 *                 collect(Collectors.groupingBy(Character::charValue, Collectors.counting()))
	 *                 .entrySet().stream().distinct().skip(2).map(e -> e.getKey()).findFirst();
	 *         System.out.println(first.get());
	 *
	 */

	public static void main(String[] args) {
		String str = "preeti";
		int times = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(Character c: str.toCharArray()) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for(Map.Entry entry: map.entrySet()) {
			if(Integer.parseInt(entry.getValue().toString()) == 1) {
				times++;
				if(times == 3) {
					System.out.println(entry.getKey());
				}
			}
		}


	}

}
