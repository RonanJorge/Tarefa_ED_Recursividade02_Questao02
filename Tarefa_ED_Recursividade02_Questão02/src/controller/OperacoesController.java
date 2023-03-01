package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public String bin(int n) {
		/* Para n maior que zero, a função deve retornar uma string com 
		 * o resto da divisão de n por 2 concatenado após a chamada da função para 
		 * o quociente de n por 2.
		 * O ponto de parada será para n igual a zero, e neste caso a função 
		 * retornará zero. */
		if(n == 0) return "";
		else {
			if(n % 2 == 0) return bin(n/2)+"0";
			else return bin(n/2)+"1";
		}
	}
}
