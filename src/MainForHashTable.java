public class MainForHashTable {
	public static void main(String[] args) {
		HashTable h = new HashTable(100);
		for (int i = 0; i < 40; i++)
			h.add("STR" + i);
		System.out.println(h.contains("STR" + 4));
		System.out.println(h.contains("STR" + 19));
		System.out.println(h.contains("Why?"));
		System.out.println(h.contains("STR" + 100));
		// true true false false
	}
}
