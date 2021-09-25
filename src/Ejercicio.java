import java.util.*;
public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("1. Realizar el registro de personas");
		System.out.println("2. Realizar el registro de paquetes");
		System.out.println("3. Registrar cuando el paquete ha sido entregado");
		System.out.println("4. Mostrar los paquetes que tengan más de cierta cantidad de kilos ingresado por el usuario.");
				
		System.out.println("5. Mostrar los paquetes que tengan el costo igual al ingresado por el usuario");
		System.out.println("6. Mostrar los paquetes pendientes de ser enviados");
		System.out.println("7. Mostrar los datos de la persona al proporcionar un paquete");
		System.out.println("8. Mostrar los datos de los paquetes al ingresar el dni de la persona");
		
		int respuesta=scan.nextInt();
		
		switch(respuesta) {
		case 1: RegistroPersona();
			break;
		case 2: RegistroPaquete();
			break;
		}
		
	}
	public static void RegistroPersona() {
		Scanner scan=new Scanner (System.in);
		Persona[] clientes = new Persona[10];
		  
		 String name,dni,celular;
		 
		 
		for (int i = 0; i < clientes.length; i++) {
			
			System.out.println("Ingrese nombre");
			name=scan.next();
			System.out.println("Ingrese edad");
			dni=scan.next();
			System.out.println("Ingrese genero");
			celular=scan.next();
			
			
			clientes[i] = new Persona(name,dni,celular);
			
		}
		for (int i = 0; i < clientes.length; i++) {
			System.out.println(clientes[i].getName());
			System.out.println(clientes[i].getDni());
			System.out.println(clientes[i].getPhoneNumber());
		
		}
	}
	public static void RegistroPaquete() {
		Scanner scan=new Scanner (System.in);
		Paquete[] paquetes = new Paquete[20];
		 int identificador;
		 Date fecha;
		 Persona persona;
		 
		 
		 
		for (int i = 0; i < paquetes.length; i++) {
			
			System.out.println("Ingrese nombre");
			identificador=scan.nextInt();
			System.out.println("Ingrese edad");
			fecha=scan.next();
			System.out.println("Ingrese genero");
			persona=scan.next();
			
			
			paquetes[i] = new Paquete(identificador,fecha,persona);
			
		}
		for (int i = 0; i < paquetes.length; i++) {
			System.out.println(paquetes[i].getIdentificador());
			System.out.println(paquetes[i].getFecha());
			System.out.println(paquetes[i].getPersonaOrigen());
		
		}
	}

}
