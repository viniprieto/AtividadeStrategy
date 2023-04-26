
public class Main {

	public static void main(String[] args) {

		Disciplina disc = new Disciplina(new Aritmetica(), "Vinícius", 7, 8);
		disc.CalcularMedia();

		System.out.println("\nMédia Aritmética");
		System.out.println(disc.getNome());
		System.out.println(disc.getSituação());
		System.out.println(disc.getMedia());
		
		Disciplina disc2 = new Disciplina(new Geometria(), "Vinícius", 7, 8);
		disc2.CalcularMedia();

		
		System.out.println("\nMédia Geométrica");	
		System.out.println(disc2.getNome());
		System.out.println(disc2.getSituação());
		System.out.println(disc2.getMedia());
		
	}

}
