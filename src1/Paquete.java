import java.util.Date;
import java.text.SimpleDateFormat;
public class Paquete {
	private int identificador;
	private Date fecha=new Date();
	private String fechaActual;
	private Persona personaOrigen;
	
	public Paquete(int pIdentificador, Persona pPersonaOrigen) {
		identificador= pIdentificador;
		personaOrigen= pPersonaOrigen;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		fechaActual=sdf.format(fecha);	
	}
	

	public int getIdentificador() {
		return identificador;
	}
	public String getFecha() {
		return fechaActual;
	}
	public Persona getPersonaOrigen() {
		return personaOrigen;
	}
	
}
