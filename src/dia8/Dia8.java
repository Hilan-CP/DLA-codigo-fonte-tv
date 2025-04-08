package dia8;

public class Dia8 {
	static final int QUANTIDADE_FILAS = 5;
	static final int TAMANHO = 10;
	public static void main(String[] args) {
		String[][] filaPessoas = new String[QUANTIDADE_FILAS][TAMANHO];
		inicializarArray(filaPessoas);
		printArray(filaPessoas);
		
		adicionarPessoa(filaPessoas, "João", 0);
		adicionarPessoa(filaPessoas, "José", 0);
		adicionarPessoa(filaPessoas, "Jorge", 1);
		adicionarPessoa(filaPessoas, "Joana", 2);
		adicionarPessoa(filaPessoas, "Jeremias", 3);
		adicionarPessoa(filaPessoas, "Josival", 4);
		adicionarPessoa(filaPessoas, "Josiane", 4);
		adicionarPessoa(filaPessoas, "Ana Maria", 4);
		adicionarPessoa(filaPessoas, "Ana Júlia", 4);
		adicionarPessoa(filaPessoas, "Ana Vitória", 4);
		adicionarPessoa(filaPessoas, "Ana Clara", 4);
		adicionarPessoa(filaPessoas, "Ana Alana", 4);
		adicionarPessoa(filaPessoas, "Mariana", 4);
		adicionarPessoa(filaPessoas, "Vitória", 4);
		adicionarPessoa(filaPessoas, "Amanda", 4);
		adicionarPessoa(filaPessoas, "Regiane", 4);
		printArray(filaPessoas);
		
		removerPessoaPrioridade(filaPessoas, "João");
		removerPessoaPrioridade(filaPessoas, "Mariana");
		removerPessoaPrioridade(filaPessoas, "Ana");
		removerPessoaPrioridade(filaPessoas, "Jonas");
		printArray(filaPessoas);
		
		removerProximaPessoa(filaPessoas, 1);
		printArray(filaPessoas);
		
		removerProximaPessoa(filaPessoas, 4);
		printArray(filaPessoas);
		
		removerProximaPessoa(filaPessoas, 4);
		printArray(filaPessoas);
		
		removerProximaPessoa(filaPessoas, 1);
		printArray(filaPessoas);
	}
	
	private static void adicionarPessoa(String[][] filas, String pessoa, int numeroFila) {
		boolean adicionado = false;
		for(int i = 0; i < filas[numeroFila].length; ++i) {
			if(filas[numeroFila][i].equals("")) {
				filas[numeroFila][i] = pessoa;
				adicionado = true;
				i = TAMANHO;
			}
		}
		if(adicionado) {
			System.out.println("Pessoa adicionada na fila " + numeroFila + " - " + pessoa);
		}
		else {
			System.out.println("Sem espaço na fila " + numeroFila + " - não foi possível adicionar " + pessoa);
		}
	}
	
	private static void removerPessoaPrioridade(String[][] filas, String pessoa) {
		boolean removido = false;
		int numeroFila = 0;
		for(int i = 0; i < filas.length; ++i) {
			for(int j = 0; j < filas[i].length; ++j) {
				if(filas[i][j].equals(pessoa)) {
					for(int k = j+1; k < filas[i].length; ++k) {
						filas[i][k-1] = filas[i][k];
						filas[i][k] = "";
					}
					removido = true;
					numeroFila = i;
				}
			}
		}
		if(removido) {
			System.out.println("Pessoa removida da fila " + numeroFila + " - " + pessoa);
		}
		else {
			System.out.println("Pessoa não encontrada " + pessoa);
		}
	}
	
	private static void removerProximaPessoa(String[][] filas, int numeroFila) {
		if(filas[numeroFila][0].equals("")) {
			System.out.println("Fila " + numeroFila + " está vazia - não há ninguém para atender");
		}
		else {
			System.out.println("Atendendo pessoa " + filas[numeroFila][0] + " - fila " + numeroFila);
			for(int i = 1; i < filas[numeroFila].length; ++i) {
				filas[numeroFila][i-1] = filas[numeroFila][i];
				filas[numeroFila][i] = "";
			}
		}
	}
	
	private static void printArray(String[][] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array[i].length; ++j) {
				System.out.print("[" + array[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println("\n----------------\n");
	}
	
	private static void inicializarArray(String[][] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array[i].length; ++j) {
				array[i][j] = "";
			}
		}
	}
}
