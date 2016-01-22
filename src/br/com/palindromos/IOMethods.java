package br.com.palindromos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Allexia Leticia
 * @description Classe contendo operações de entrada/saída com arquivos
 */
public class IOMethods {
	
	/**
	 * @description Método responsável por ler um arquivo
	 * @param inputFilePath, contendo o caminho do arquivo que será lido
	 * @return List<String> contendo as linhas do arquivo lido
	 * @throws IOException
	 */
	public List<String> readFile(String inputFilePath, Charset encoding) throws IOException {
		Path path = Paths.get(inputFilePath);
		return Files.readAllLines(path, encoding);
	}
	
	/**
	 * @description Método responsável por escrever em um arquivo
	 * @param outputList, contendo as linhas que serão escritas
	 * @param outputFilePath, contendo o caminho do arquivo que será escrito
	 * @throws IOException
	 */
	public void writeFile(List<String> outputList, String outputFilePath, Charset encoding) throws IOException {
		Path path = Paths.get(outputFilePath);
		Files.write(path, outputList, encoding);
	}
}
