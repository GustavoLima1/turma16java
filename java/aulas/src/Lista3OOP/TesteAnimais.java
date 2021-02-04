package Lista3OOP;

public class TesteAnimais {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Caramelo",8);
		Cavalo horse = new Cavalo ("BoJack",15);
		Preguiça preg = new Preguiça("Zoooooo",7);
		
		System.out.println(dog.status());
		System.out.println(horse.status());
		System.out.println(preg.status());
	}

}
