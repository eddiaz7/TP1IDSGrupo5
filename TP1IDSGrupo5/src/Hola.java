
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

	}

}