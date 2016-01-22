package br.com.palindromos;

/**
 * @author Allexia Leticia
 * @description Classe contendo operações de comparação de Strings
 */
public class StringComparer {

	/**
	 * @description Método responsável por verificar se uma palavra é palíndromo
	 * @param word, contendo a palavra que será comparada
	 * @return true: se palíndromo, false: se não palíndromo
	 */
	public boolean Palindrome(String word) {
		StringBuilder backwards = new StringBuilder();
		
		for (int i = word.length()-1; i >= 0; i--) {
			backwards.append(word.charAt(i));
		}
		
		return word.equalsIgnoreCase(backwards.toString());
	}

}
