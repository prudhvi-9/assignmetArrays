package arrayss;

public class FrequenciesArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 1, 2, 3, 4, 4, 45, 5, 6, 6, 7, 7, 1, 1, 2, 2, };

		int[] fq = new int[arr.length];
		int occurance = -2;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fq[j] = occurance;
				}
			}
			if (fq[i] != occurance)
				fq[i] = count;
		}
		for (int i = 0; i < fq.length; i++) {
			if (fq[i] != occurance)
				System.out.println("    " + arr[i] + "    " + fq[i]);
		}

	}

}
