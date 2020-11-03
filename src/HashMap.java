public class HashMap extends HashTable {
	private String[] values;

	public HashMap(int size) {
		super(size);
		values = new String[size];
	}

	public void put(String key, String value) {
		int i = indexOf(key);
		table[i] = key;
		values[i] = value;
	}

	public String get(String key) {
		int i = indexOf(key);
		if (table[i] == null)
			return null;
		else
			return values[i];
	}
}
