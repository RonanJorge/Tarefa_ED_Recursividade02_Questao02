/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 02)  Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
 * recebendo um n�mero inteiro, converta para bin�rio. 
 * Entrada limitada a 2000.
 */

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n:"));
		System.out.println("O n�mero n em bin�rio �: "+ op.bin(n)+".");
	}

}
