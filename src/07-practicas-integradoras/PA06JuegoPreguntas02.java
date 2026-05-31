/**
 * PRÁCTICA INTEGRADORA: Juego de Preguntas
 * ---------------------------------------------------------------
 * Concepto: Condicionales anidados y flujo de juego interactivo.
 * 
 * DESCRIPCIÓN: 
 * Juego de trivia tipo "Muerte Súbita". El usuario debe responder 
 * correctamente tres preguntas de opción (Sí/No). Si falla una, 
 * el juego termina inmediatamente. Solo gana si responde todas bien.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 15 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06JuegoPreguntas02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resp;

        System.out.println("--- JUEGO DE TRIVIA ---");
        
        // Pregunta 1
        System.out.print("1. ¿Colón descubrió América? (1-Si, 2-No): ");
        resp = leer.nextInt();
        if (resp != 1) { System.out.println("¡Has perdido!"); return; }

        // Pregunta 2
        System.out.print("2. ¿La independencia de México fue en 1810? (1-Si, 2-No): ");
        resp = leer.nextInt();
        if (resp != 1) { System.out.println("¡Has perdido!"); return; }

        // Pregunta 3
        System.out.print("3. ¿The Doors fue un grupo de rock americano? (1-Si, 2-No): ");
        resp = leer.nextInt();
        if (resp == 1) {
            System.out.println("¡Felicidades! ¡Has ganado!");
        } else {
            System.out.println("¡Has perdido!");
        }
    }
}
