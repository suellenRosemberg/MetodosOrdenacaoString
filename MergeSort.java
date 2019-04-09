package trabalhoI;

public class MergeSort {

	public void mergeSort(String a[], int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(a, start, middle);
			mergeSort(a, middle + 1, end);

			merge(a, start, middle, end);
		}
	}

	public void merge(String a[], int start, int middle, int end) {
		String b[] = new String[a.length];

		for (int i = start; i <= end; i++) {
			b[i] = a[i];
		}

		int i = start;
		int j = middle + 1;
		int k = start;

		while (i <= middle && j <= end) {
			if (b[i].compareTo(b[j])<0)
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}

		while (i <= middle) {
			a[k++] = b[i++];
		}
	}

	public static void main(String[] args) {

		MergeSort b = new MergeSort();

		String vet[] = { "orelha", "agua","barraca"  };

		b.mergeSort(vet, 0, vet.length - 1);

		System.out.println("As palavras em ordem crescente são:");
		
		for (int i = 0; i < vet.length; i++) {
			
			System.out.println( i+1 +"º"+ " ( " + vet[i] + " ) ");
		}
	}

}