/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 02)  Criar uma aplicação em Java que tenha uma função recursiva que,
 * recebendo um número inteiro, converta para binário. 
 * Entrada limitada a 2000.
 */

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n:"));
		System.out.println("O número n em binário é: "+ op.bin(n)+".");
	}

}
