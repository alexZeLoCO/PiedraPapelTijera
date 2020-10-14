import java.util.Scanner;		//IMPORTA SCANNER
public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA OBJETO TIPO SCANNER
		int win = 0;		//DECLARA SI HAY O NO VICTORIA (0 NO / 1 SÍ)
		while (win ==  0) {		//MIENTRAS NO HAYA VICTORIA:
			
			System.out.print("Elija su jugada: 1 Piedra - 2 Papel - 3 Tijera: "); 		//MUESTRA LAS JUGADAS
			int usr = teclado.nextInt();		//JUGADA USUARIO
			if (usr == 1) {		//SI USUARIO ESCRIBE 1 (PIEDRA)
				System.out.println("Has jugado piedra.");		//AVISO
			}
			if (usr == 2) {		//SI USUARIO ESCRIBE 2 (PAPEL)
				System.out.println("Has jugado papel.");		//AVISO
			}
			if (usr == 3) {		//SI USUARIO ESCRIBE 3 (PIEDRA)
				System.out.println("Has jugado tijera.");		//AVISO
			}
			if (usr > 3 || usr < 1) {		//SI USUARIO ESCRIBE ALGO QUE NO SEA 1 2 O 3
				System.out.print("Has introducido un valor no válido.");		//AVISO
				System.exit(0);		//CIERRA PROGRAMA
			}
			
			/*
			 * EL MÉTODO MATH.RANDOM() ELEGIRÁ UN NÚMERO REAL ALEATORIO, POR ELLO, LE AÑADIMOS EL (INT) AL PRINCIPIO. DE ESA FORMA LO TRANSFORMAMOS EN ENTERO.
			 * EL NÚMERO ELEGIDO NO TIENE POR QUÉ ESTAR ENTRE 1 Y 3, POR ELLO, AÑADIREMOS UN BUCLE WHILE QUE CONDICIONE LA SALIDA DEL MÉTODO.
			 * MIENTRAS EL VALOR ELEGIDO ALEATORIAMENTE NO ESTÉ ENTRE 1 Y 3, SE SEGUIRÁN ELEGIENDO VALORES.
			 */
			
			double pc = 12; 		//CREA VARIABLE PC CON VALOR > 10
			while (Math.abs(pc)>3 ) {		//MIENTRAS PC NO SEA 1 2 Ó 3.
				pc = (Math.random());		//SELECCIONAR NUEVO PC
			}
			if (pc < 1 && pc > 0) {		//SI PC ES 1
				System.out.println("Bot ha jugado piedra.");		//AVISO
			}
			if (pc < 2 && pc > 1) {		//SI PC ES 2
				System.out.println("Bot ha jugado papel.");		//AVISO
			}
			if (pc < 3 && pc > 2) {		//SI PC ES 3
				System.out.println("Bot ha jugado tijera.");		//AVISO
			}
			
			
			if (usr == 1 && pc < 2 && pc > 1) {		//SI USUARIO JUGÓ PIEDRA Y PC ES PAPEL
				System.out.print("Ha ganado Bot");		//GANA BOT
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			if (usr == 2 && pc < 3 && pc > 2) {		//SI USUARIO JUGÓ PAPEL Y PC ES TIJERA
				System.out.print("Ha ganado Bot");		//GANA BOT
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			if (usr == 3 && pc < 1 && pc > 0) {		//SI USUARIO JUGÓ TIJERA Y PC ES PIEDRA
				System.out.print("Ha ganado Bot");		//GANA BOT
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			if (usr == 1 && pc < 2 && pc > 1) {		//SI USUARIO JUGÓ PIEDRA Y PC ES TIJERA
				System.out.print("Ha ganado Jugador");		//GANA USUARIO
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			if (usr == 2 && pc < 1 && pc > 0) {		//SI USUARIO JUGÓ PAPEL Y PC ES PIEDRA
				System.out.print("Ha ganado Jugador");		//GANA USUARIO
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			if (usr == 3 && pc < 2 && pc > 1) {		//SI USUARIO ES TIJERA Y PC ES PAPEL
				System.out.print("Ha ganado Jugador");		//GANA USUARIO
				win = 1;		//CAMBIA VALOR DE WIN PARA CERRAR BUCLE WHILE
			}
			//SI NO ES NINGUNA DE LAS ANTERIORES, NO GANA NADIE, SE SIGUE JUGANDO Y VUELVE A COMENZAR EL BUCLE WHILE
		}	
	}
}
