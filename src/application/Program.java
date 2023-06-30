package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		// estrutura de dados MAP, não adimite repetições da chave

		Map<String, String> cookies = new TreeMap<String,String>();
		

		// put - operation to insert an Element on the Map data structure
		cookies.put("usuario", "Rafael".toUpperCase());
		cookies.put("email", "rafael@gmail.com");
		cookies.put("emailRecuperacao", "rafael1712@gmail.com");
		cookies.put("endereco", "Rua Brasil n.º 1712");
		cookies.put("telefone", "519924585");
		cookies.remove("email");
		// vai sobrescrer o telefone, pois não aceita valores repetidos para key.
		cookies.put("telefone", "519915439");

		// um TreeMap de string vai ordenar por ordem alfabética
		// um TreeMap de integer vai ordenar por ordem numérica crescente por padrão
		System.out.println("Printing all coockies :");
		for (String key : cookies.keySet()) {

			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println("\nPrinting just the keys: " + cookies.keySet());
		System.out.println("Printing just the values: " + cookies.values());

		System.out.println("\n--------------");
		System.out.println("Contains the key 'usuario': " + cookies.containsKey("usuario"));
		System.out.println("Contains the value 'Carol': " + cookies.containsValue("Carol"));
		System.out.println("Contains the value 'RAFAEL': " + cookies.containsValue("rafael".toUpperCase()));
		System.out.println("Contains the key 'email': " + cookies.get("email")); // null
		System.out.println("Size of the map: " + cookies.size());
		cookies.clear();
		System.out.println("Size of the map after clear: " + cookies.size());

	}
}
