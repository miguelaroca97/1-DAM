
public class PrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo!");
		
		// Ejercicio 1
		final String name = "Miguel Angel Aroca Rodriguez";
		System.out.println(name);
		// Ejercicio 2
		int num1, num2;
		num1 = 4;
		num2 = 1;
		int suma = num1 + num2;
		System.out.println(suma);
		// Ejercicio 3
		double tri1, tri2, tri3;
		tri1 = 1.5;
		tri2 = 3.4;
		tri3 = 6.7;
		double perimetro = tri1 + tri2 + tri3;
		System.out.println(perimetro);
		// Ejercicio 4
		int prom1, prom2, prom3;
		prom1 = 6;
		prom2 = 45;
		prom3 = 23;
		int promedio = (prom1 + prom2 + prom3) / 3;
		System.out.println(promedio);
		// Ejercicio 5
		final double pi = 3.14;
		double radio = 6.7;
		double triradio = radio * radio * radio;
		double volumen = (4 / 3) * pi * triradio;
		System.out.println(volumen);
		// Ejercicio 6
		System.out.println(5 * 0.621371);
		double km = 5.0;
		double conversion = km * 0.621371;
		System.out.println(conversion);
		/// el resultado es el mismo, lo unico que cambia es que de la primera forma el resultado no se guarda en ninguna variable.
		// Ejercicio 7
		double cociente1, cociente2;
		cociente1 = 23;
		cociente2 = 7;
		double cociente = cociente1 / cociente2;
		System.out.println(cociente);
		double resto = cociente1 % cociente2;
		System.out.println(resto);
		// Ejercicio 8
		int celsius;
		celsius = 25;
		int farhenheit = 32 + (9 * celsius /5);
		System.out.println(farhenheit);
		// Ejercicio 9
		double kmh = 95;
		double ms = kmh * 5 / 18;
		System.out.println(ms);
		// Ejercicio 10
		double cateto1 = 25;
		double cateto2 = 9;
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
		System.out.println(hipotenusa);
	}

}
