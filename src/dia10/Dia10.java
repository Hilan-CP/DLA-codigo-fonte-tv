package dia10;

public class Dia10 {
	static final int CAPACIDADE = 10;
	public static void main(String[] args) {
		String[] produtos = new String[CAPACIDADE];
		for(int i = 0; i < CAPACIDADE; ++i) {
			produtos[i] = "";
		}
		for(int i = 0; i < 45; ++i) {
			empilhar(produtos, "Produto"+i);
		}
		
		System.out.println("Quantidade restante em estoque");
		int ultimoItem = quantidadeAtual(produtos) - 1;
		for(int i = ultimoItem; i >= 0; --i) {
			System.out.print(produtos[i] + " ");
		}
	}
	
	private static void empilhar(String[] array, String novoItem) {
		int quantidade = quantidadeAtual(array);
		if(quantidade == CAPACIDADE) {
			System.out.println("Pilha cheia");
			desempilhar(array);
			quantidade = 0;
		}
		array[quantidade] = novoItem;
	}
	
	private static int quantidadeAtual(String[] array) {
		for(int i = 0; i < CAPACIDADE; ++i) {
			if(array[i].equals("")) {
				return i;
			}
		}
		return CAPACIDADE;
	}
	
	private static void desempilhar(String[] array) {
		System.out.println("Enviando produtos e esvaziando pilha...");
		for(int i = CAPACIDADE-1; i >= 0; --i) {
			System.out.print(array[i] + " ");
			array[i] = "";
		}
		System.out.println("\n-----------\n");
	}
}
