
public class Arrays_Practica2_Willy {

	public static void main(String[] args) {
//		Ejercicio 1.- Escriba un programa que permita crear una arreglo de palabras y 
//		que, a continuaci�n, pida dos palabras y sustituya la primera por 
//		la segunda en la lista.
		
		System.out.print("Cuantas palabras ingresar�: ");
		int tamano = Entrada.entero();
		String [] Nombres = new String [tamano];
		for (int i = 0; i < tamano; i++)
		{
			System.out.print("D�game la palabra " + (i + 1) + ": ");
			Nombres [i] = Entrada.cadena();
		}
		String mascota = "";
		for (int i = 0; i < tamano; i++)
		{
			if (i == tamano -1)
			{
				mascota = mascota +"'" + Nombres [i] +"'";
			} else 
			{
				mascota = mascota +"'" + Nombres [i] +"', ";	
			}
		}
		System.out.print(temp);

	}

}
