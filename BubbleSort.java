package trabalhoI;

public class BubbleSort {

	public void bubblesort(String vet[]) {
		
	String aux = null;
	
	for (int i = vet.length - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (vet[j].compareToIgnoreCase(vet[j + 1]) > 0) {
				aux = vet[j];
				vet[j] = vet[j + 1];
				vet[j + 1] = aux;
			}
		}
	}
} 
	


	public static void main(String[] args) {

		BubbleSort b = new BubbleSort();

		String a[] = { "ana","rua", "guia" };

		b.bubblesort(a);
		
		System.out.println("As palavras em ordem crescente são:");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println( i+1 +"º"+ " ( " + a[i] + " ) ");
		}
	}

}