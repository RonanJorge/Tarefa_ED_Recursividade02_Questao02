package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public String bin(int n) {
		/* Para n maior que zero, a fun��o deve retornar uma string com 
		 * o resto da divis�o de n por 2 concatenado ap�s a chamada da fun��o para 
		 * o quociente de n por 2.
		 * O ponto de parada ser� para n igual a zero, e neste caso a fun��o 
		 * retornar� zero. */
		if(n == 0) return "";
		else {
			if(n % 2 == 0) return bin(n/2)+"0";
			else return bin(n/2)+"1";
		}
	}
}
