package br.com.palindromos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Allexia Leticia
 * @description Projeto de Palindromos
 */
public class PalindromeTest {

	final static String INPUT_FILE_NAME = "lista.txt";
	final static String OUTPUT_FILE_NAME = "resultado.txt";
	final static String ENTRADA_SAIDA = "ENTRADA >> SAIDA";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	public static void main(String[] args) throws IOException {
		
		try {
			// Vari�vel respons�vel por armazenar temporariamente 
			// se uma palavra � ou n�o um pal�ndromo
			String palindrome;
			
			// Cria uma inst�ncia da classe IOMethods,
			// contendo as opera��es de entrada e sa�da
			IOMethods methods = new IOMethods();
			
			// Cria uma inst�ncia da classe StringComparer,
			// contendo as opera��es de compara��o de Strings
			StringComparer comparer = new StringComparer();
			
			// Vari�veis respons�veis por armazenar o conte�do de
			// entrada (input) e sa�da (output) da aplica��o
			List<String> wordsInputList = new ArrayList<String>();
			List<String> wordsOutputList = new ArrayList<String>();
			
			System.out.println("--- Iniciando Execucao ---");
			
			// Armazena as palavras do arquivo na vari�vel de entrada
			wordsInputList = methods.readFile(INPUT_FILE_NAME, ENCODING);
			
			// Adiciona cabe�alho para o arquivo de sa�da
			wordsOutputList.add(ENTRADA_SAIDA);
			
			System.out.println("--- Percorrendo arquivo de entrada (lista.txt) ---");
			
			// Para cada palavra na lista de palavras,
			// verifica se ela � igual ao seu inverso
			for (String word : wordsInputList) {
				palindrome = comparer.Palindrome(word) ? "sim" : "nao";
				wordsOutputList.add(word + " >> " + palindrome);
			}
			
			// Escreve o resultado no arquivo de sa�da
			methods.writeFile(wordsOutputList, OUTPUT_FILE_NAME, ENCODING);
			
			System.out.println("--- Arquivo de saida (resultado.txt) preenchido ---");
		} catch (IOException ex) {
			System.out.println("--- Ocorreu um erro ---");
			ex.printStackTrace();
		} finally {
			System.out.println("--- Fim da Execucao ---");
		}
	}
}