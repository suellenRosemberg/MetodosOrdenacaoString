package trabalhoI;

public class InsertionSort {

	public void insertionSort(String a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			while (j > 0 && a[j - 1].compareToIgnoreCase(a[j])>0) {
				String aux = a[j];
				a[j] = a[j - 1];
				a[j - 1] = aux;
				j -= 1;
			}
		}
	}

	public static void main(String[] args) {
		InsertionSort a = new InsertionSort();

		String vet[] = { " Casa " , " Arvore " , " Pato "};

		a.insertionSort(vet);
		
		System.out.println("As palavras em ordem crescente são:");

		for (int i = 0; i < vet.length; i++) {
			
			System.out.println( i+1 +"º"+ " ( " + vet[i] + " ) ");
		}
	}
}