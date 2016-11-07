

import java.util.Scanner;

public class ImcCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		System.out.println("Hola, ingresa tu nombre");
		Scanner name = new Scanner (System.in);
		String name1 = name.nextLine();
		//System.out.println(name1);
		
		System.out.println("Ingresa tu edad");
		Scanner edad = new Scanner (System.in);
		String edad1 = edad.nextLine();
		//System.out.println(edad1);
		
		System.out.println("Ingresa tu altura en centimetros y sin puntos");
		Scanner altura = new Scanner (System.in);
		int altura1 = altura.nextInt();
		
		
		/*
		try { 
			
			 altura1 = Integer.parseInt(altura.next());
		
		
		} catch (NumberFormatException e) {
			System.out.println("El valor no puede ser una letra");
		}
		
		*/
		
		if (altura1 == 0){
			System.out.println("Error la altura no puede ser cero, intenta de nuevo");
			
		}
		
		switch (altura1){
		
		case 0:
			return;
			
			default:
				System.out.println("Ingresa tu peso en kilos");
				break;
		
		}
		
		
		Scanner peso = new Scanner (System.in);
		int peso1 = peso.nextInt();
		
		
		if (peso1 == 0) {
			System.out.println("Error, el peso no puede ser cero, intenta de nuevo");
	
		}
		
		
		switch (peso1){
		
		case 0:
			return;
			
			default:
				System.out.println("Tu IMC es ");
				break;
		}

		double IMC;
		IMC = peso1 / Math.pow((altura1*.01)/ 1.0, 2.0); 
		
	
		System.out.println(IMC);
		
		
		if (IMC <= 25 && IMC!=0) {
			System.out.println("Estas Sano");
		} else if (IMC > 25)	{
			System.out.println("Tienes sobrepeso");
		
		
		}
		
		
		
		
	}

}