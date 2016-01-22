package br.com.palindromos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Allexia Leticia
 * @description Classe contendo opera��es de entrada/sa�da com arquivos
 */
public class IOMethods {
	
	/**
	 * @description M�todo respons�vel por ler um arquivo
	 * @param inputFilePath, contendo o caminho do arquivo que ser� lido
	 * @return List<String> contendo as linhas do arquivo lido
	 * @throws IOException
	 */
	public List<String> readFile(String inputFilePath, Charset encoding) throws IOException {
		Path path = Paths.get(inputFilePath);
		return Files.readAllLines(path, encoding);
	}
	
	/**
	 * @description M�todo respons�vel por escrever em um arquivo
	 * @param outputList, contendo as linhas que ser�o escritas
	 * @param outputFilePath, contendo o caminho do arquivo que ser� escrito
	 * @throws IOException
	 */
	public void writeFile(List<String> outputList, String outputFilePath, Charset encoding) throws IOException {
		Path path = Paths.get(outputFilePath);
		Files.write(path, outputList, encoding);
	}
}
