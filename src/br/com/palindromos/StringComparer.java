package br.com.palindromos;

/**
 * @author Allexia Leticia
 * @description Classe contendo opera��es de compara��o de Strings
 */
public class StringComparer {

	/**
	 * @description M�todo respons�vel por verificar se uma palavra � pal�ndromo
	 * @param word, contendo a palavra que ser� comparada
	 * @return true: se pal�ndromo, false: se n�o pal�ndromo
	 */
	public boolean Palindrome(String word) {
		StringBuilder backwards = new StringBuilder();
		
		for (int i = word.length()-1; i >= 0; i--) {
			backwards.append(word.charAt(i));
		}
		
		return word.equalsIgnoreCase(backwards.toString());
	}

}
