package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		// conversão implicita
		double a = 1; 
		System.out.println("Enricco");
		
		// conversão explicita (CAST)
		float b = (float) 1.2345613245678; // Aqui vamos ter perda de informação. 
		System.out.println(b);
		
		// O Java não olhar os valores sim os tipos
		// Conversão explicita (CAST)
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}

}