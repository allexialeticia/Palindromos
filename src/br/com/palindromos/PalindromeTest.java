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
			// Variável responsável por armazenar temporariamente 
			// se uma palavra é ou não um palíndromo
			String palindrome;
			
			// Cria uma instância da classe IOMethods,
			// contendo as operações de entrada e saída
			IOMethods methods = new IOMethods();
			
			// Cria uma instância da classe StringComparer,
			// contendo as operações de comparação de Strings
			StringComparer comparer = new StringComparer();
			
			// Variáveis responsáveis por armazenar o conteúdo de
			// entrada (input) e saída (output) da aplicação
			List<String> wordsInputList = new ArrayList<String>();
			List<String> wordsOutputList = new ArrayList<String>();
			
			System.out.println("--- Iniciando Execucao ---");
			
			// Armazena as palavras do arquivo na variável de entrada
			wordsInputList = methods.readFile(INPUT_FILE_NAME, ENCODING);
			
			// Adiciona cabeçalho para o arquivo de saída
			wordsOutputList.add(ENTRADA_SAIDA);
			
			System.out.println("--- Percorrendo arquivo de entrada (lista.txt) ---");
			
			// Para cada palavra na lista de palavras,
			// verifica se ela é igual ao seu inverso
			for (String word : wordsInputList) {
				palindrome = comparer.Palindrome(word) ? "sim" : "nao";
				wordsOutputList.add(word + " >> " + palindrome);
			}
			
			// Escreve o resultado no arquivo de saída
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