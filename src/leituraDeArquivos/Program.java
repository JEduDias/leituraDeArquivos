package leituraDeArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\temp\\produtos.csv";
		String produtoRecebido;
		
		Produto produto = new Produto();
		
		List<Produto> list = new ArrayList<>();
		
		boolean success = new File("C:\\temp\\" + "\\out").mkdir();
		
		String pathOut = "C:\\temp\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				System.out.println(line);
				produtoRecebido = line;
				String[] textoSeparado = produtoRecebido.split(",");
				String name = textoSeparado[0];
				Double preco = Double.parseDouble(textoSeparado[1]);
				Integer quantidade = Integer.parseInt(textoSeparado[2]);
				
				
				list.add(new Produto(name, preco, quantidade));
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
			for (Produto p : list) {
				bw.write(p.getNome() + "," +  String.format("%.2f", p.precoTotal()));
				bw.newLine();
			}
				
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		

	}

}
