package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 30;
		notas[1][1] = 40;
		notas[1][2] = 50;
		
		for (int linha = 0; linha < notas.length; linha++) {
			int posLinha = linha;
			System.out.print( posLinha > 0 ? "\n\n" : "" );
			System.out.println((posLinha + 1) +"º linha.");
			System.out.println("*************************");
			for (int co = 0; co < notas[linha].length; co++) {
				System.out.print("Coluna " + (co + 1) + " ");	
			}
			System.out.println();
			for (int col = 0; col < notas[linha].length; col++) {
				System.out.print(notas[linha][col] + "       ");
			}
		} 
		
	}
	
}
