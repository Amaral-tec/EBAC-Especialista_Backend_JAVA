package br.com.amaral;

public class PrimeiraClasse {

	public static void main(String[] args) {
		String ambiente = args[0];
		
		if (ambiente.equals("1")) {
			System.out.print("HelloWorld");
			} 
		
		else {
			System.out.print("HelloWorld - Erro no teste " + args[0]);
			
			}
		}
	}
