package trabalhoI;

/* Quick Sort Ordenar String */

import java.util.Scanner;

public class QuickSort {

	public static void quicksort(String a[], int init, int end) {
		int i = partition(a, init, end);

		if (init < i - 1)
			quicksort(a, init, i - 1);

		if (i < end)
			quicksort(a, i, end);
	}

	public static int partition(String a[], int init, int end) {

		int i = init;
		int j = end;

		String pivot = a[(init + end) / 2];

		while (i <= j) {

			while (a[i].compareTo(pivot) < 0) {
				i++;
			}

			while (a[j].compareTo(pivot) > 0) {
				j--;
			}

			if (i <= j) {
				String aux = a[i];
				a[i++] = a[j];
				a[j--] = aux;
			}
		}

		return i;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade de itens:");
		int n = input.nextInt();
		
		String vet[] = new String[n];

		System.out.println("Digite os elementos:");
		for (int i = 0; i < n; i++) {
			vet[i] = input.next();
		}

		quicksort(vet, 0, vet.length - 1);
		
		System.out.println("As palavras em ordem crescente são:");

		for (int i = 0; i < vet.length; i++) {
			
			System.out.println( i+1 +"º"+ " ( " + vet[i] + " ) ");
		}
	}

}


