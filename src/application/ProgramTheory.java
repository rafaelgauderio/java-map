package application;

public class ProgramTheory {

	public static void main(String[] args) {

		System.out.println("Map<key, value>\n"
				+ "\tÉ uma estrutura de dados de chave e valor.\n"
				+ "\tNão admite repetições no key do objeto map.\n"
				+ "\tOs elementos são indexados pela key, assim sendo não tem index.\n"
				+ "\tPossuem acesso, inserção e remoção rápida dos elementos.\n"
				+ "\tMuito usado para logs, cookies, local storage.\n"
				+ "\nPrincipais implementações.\n"
				+ "\tHashMap: rápido e sem ordem.\n"
				+ "\tLinkedHashMap: velocidade intermediária e ordem natural dos elementos adicionados.\n"
				+ "\tTreeMap: mais lento e ordenado pelo método compareTo ou Comparator da classe Object.\n");

	}

}
