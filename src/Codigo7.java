import java.util.HashMap;//SE IMPORTA HASHMAP
import java.util.Scanner;//SE IMPORTA SCANNER

public class Codigo7 {
	
	//EL CODIGO TE DA UNA CAPITAL SIEMPRE Y CUANDO ESCRIBAS EL NOBRE DE UN PAIS 
	//CORRECTAMENTE DE LO CONTRARIO TE MANDA UN MENSAJE DE NO CONZCO LA RESPUESTA Y AHI TE DIRA
	// QUE LE ESCRIBAS LA CAPITAL PARA LUEGO DARTE LAS GRACIAS POR APRENDER UNA NUEVA CAPITAL
	
	public static void main(String[] args) { //Se agrega public static
		Scanner s = new Scanner(System.in);

		HashMap<String, String> capitales  = new HashMap<>(); //Capitales

		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		capitales.put("El Salvador", "San salvador"); //Se Agrega la capital
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
   
		String c = ""; //STRING

		do {
			System.out.print("Escribe el nombre de un país y te diré su capital: "); //OUT 
			c = s.nextLine();
      
			if (!c.equalsIgnoreCase("salir")) {  //equalsIgnoreCase
				if (capitales.containsKey(c)) { //CAPITALES // CONSTAINKEY POR constainvalue
					System.out.print("La capital de " + c ); //OUT
					System.out.println(" es " + capitales.get(c)); // put A GET
				} else {
					System.out.print("No conozco la respuesta ");
					System.out.print("¿cuál es la capital de " + c + "?: ");
					String capital = s.nextLine();
					capitales.put(c, capital); //CAPITALES-CAPITAL
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}
		} while (!c.equals("salir")); //WHILE Y CERRAR EL )
		
	}
}







