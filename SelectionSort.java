package trabalhoI;



public class SelectionSort {

	public void selectionSort(String a[]) {
		String aux = null;
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[min])<0)
					min = j;
			}
			if (min != i) {
				aux = a[i];
				a[i] = a[min];
				a[min] = aux;
			}
		}
	}

	public static void main(String[] args) {
		SelectionSort b = new SelectionSort();

		String vet[] = { "Ana", "Zeus", "Viagem"};

		b.selectionSort(vet);
		
		System.out.println("As palavras em ordem crescente são:");

		for (int i = 0; i < vet.length; i++) {
			
			System.out.println( i+1 +"º"+ " ( " + vet[i] + " ) ");
		}
	}
}