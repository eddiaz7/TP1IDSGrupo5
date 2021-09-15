
public class Hola {
	private String saludo;
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public static void main(String[] args) {
		Hola hola = new Hola();
		
		hola.setSaludo("Prueba");
		hola.setSaludo("Prueba2");
		System.out.println(hola.getSaludo());
        System.out.println("Hola mundo");
        System.out.println("Esta linea la va a escribir release1");
        System.out.println("Hola segunda modificacion en release2");
        System.out.println("Hola modificaciones en release2");
        System.out.println("Elimino punto A");
        System.out.println("Agrego punto B");
	
	}

}