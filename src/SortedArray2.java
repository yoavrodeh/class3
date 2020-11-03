import java.util.Arrays;

public class SortedArray2 {
	private int[] a;

	public SortedArray2(int a[]) {
		this.a = new int[a.length];
		for (int i = 0; i < a.length; i++)
			this.a[i] = a[i];
	}	
	
	protected int get(int i) {
		return a[i];
	}
	
	protected void set(int i, int val) {
		a[i] = val;
	}
	
	protected int len() {
		return a.length;
	}

	protected void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sort() {
		for (int i = 1; i < a.length; i++)
			for (int j = i; j > 0 && a[j] < a[j-1]; j--)
				swap(j, j - 1);
	}

	@Override
	public String toString() {
		return Arrays.toString(a);
	}
}
