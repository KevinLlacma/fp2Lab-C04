
public class Persona {
	private String name;
	private String dni;
	private String celular;
	private String dni1;
	
	public Persona() {
		
	}
	public Persona(String pName, String pDni, String pCelular) {
		name = pName;
		dni = pDni;
		celular = pCelular;
		
	}
	public void ingresoDni(String dni) {
		
		dni1=dni;	
		if(dni1==dni) {
			dni1=dni;
		}
	}
		
	public String getName() {
		return name;
	}
	public String getDni() {
		return dni;
	}
	public String getPhoneNumber() {
		return celular;
	}
	
	
}
