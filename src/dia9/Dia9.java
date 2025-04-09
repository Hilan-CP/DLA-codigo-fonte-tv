package dia9;

public class Dia9 {
	public static void main(String[] args) {
		String[] pessoa = {"Julio", "Julia", "Juliana", "Ana", "Maria", "Beatriz", "Alana", "Roberto", "Ana", "Ana"};
		printArray(pessoa);
		System.out.println("Índice da Ana: " + indexOf(pessoa, "Ana"));
		System.out.println("Último índice da Ana: " + lastIndexOf(pessoa, "Ana"));
		System.out.println("Contém Ana: " + includes(pessoa, "Ana"));
		System.out.println("Contém Rodolfo: " + includes(pessoa, "Rodolfo"));
		System.out.println("----------");
		
		String[] primeiros = slice(pessoa, 0, 4);
		printArray(primeiros);
		
		String[] meio = slice(pessoa, 2, 5);
		printArray(meio);
	}
	
	private static void printArray(String[] array) {
		System.out.println("Tamanho: " + array.length);
		for(int i = 0; i < array.length; ++i) {
			System.out.print("[" + array[i] + "] ");
		}
		System.out.println("\n----------\n");
	}
	
	private static int indexOf(String[] array, String elemento) {
		for(int i = 0; i < array.length; ++i) {
			if(array[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean includes(String[] array, String elemento) {
		for(int i = 0; i < array.length; ++i) {
			if(array[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	private static int lastIndexOf(String[] array, String elemento) {
		int lastIndex = -1;
		for(int i = 0; i < array.length; ++i) {
			if(array[i].equals(elemento)) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	
	private static String[] slice(String[] array, int inicio, int fim) {
		int tamanho = fim - inicio + 1;
		String[] novoArray = new String[tamanho];
		for(int i = 0; i < tamanho; ++i) {
			novoArray[i] = array[inicio];
			++inicio;
		}
		return novoArray;
	}
}
