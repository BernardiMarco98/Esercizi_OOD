package animali;

public class Executor {
	public static void main(String[] args) {
		Factory factory = new Factory();
		
		Animale animale1 = factory.getAnimale("cane"); 
		Animale animale2 = factory.getAnimale("gatto"); 
		Animale animale3 = factory.getAnimale("pecora"); 
		
		animale1.emettiVerso();
		animale2.emettiVerso();
		animale3.emettiVerso();
	}

}
