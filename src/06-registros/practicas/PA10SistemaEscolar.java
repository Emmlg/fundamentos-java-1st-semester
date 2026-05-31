/**
 * EJERCICIO: Sistema Escolar (Gestión de Calificaciones)
 * ---------------------------------------------------------------
 * Concepto: Registros complejos, validación de entrada y menús CRUD.
 * 
 * DESCRIPCIÓN: 
 * Sistema integral para gestionar las notas de Matemáticas. 
 * Almacena datos personales y 5 calificaciones por alumno. 
 * Permite añadir, buscar, eliminar y generar informes, 
 * calculando promedios automáticamente.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Junio 2021
 */
package practicas;

import java.util.Scanner;

public class PA10SistemaEscolar {
    static Scanner leer = new Scanner(System.in);
    static int noReg = 0;
    static final int TAMANIO = 10;

    static class Estudiante {
        String noControl, nombre, apePat, apeMat;
        int[] cals = new int[5];
        float promedio;
    }

    public static void main(String[] args) {
        Estudiante[] registros = new Estudiante[TAMANIO];
        int opcion;

        do {
            System.out.println("
--- GESTIÓN DE CALIFICACIONES ---");
            System.out.println("1. Añadir
2. Buscar
3. Eliminar
4. Informe General
5. Salir");
            System.out.print("Opción: ");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1: añadir(registros); break;
                case 2: buscar(registros); break;
                case 3: eliminar(registros); break;
                case 4: informe(registros); break;
            }
        } while (opcion != 5);
    }

    static void añadir(Estudiante[] reg) {
        if (noReg >= TAMANIO) { System.out.println("Cupo lleno."); return; }
        Estudiante e = new Estudiante();
        System.out.print("No. Control: "); e.noControl = leer.next();
        System.out.print("Nombre: "); e.nombre = leer.next();
        System.out.print("Ape. Paterno: "); e.apePat = leer.next();
        System.out.print("Ape. Materno: "); e.apeMat = leer.next();

        int suma = 0;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Calificación Unidad " + (i+1) + " (0-100): ");
                e.cals[i] = leer.nextInt();
            } while (e.cals[i] < 0 || e.cals[i] > 100);
            suma += e.cals[i];
        }
        e.promedio = suma / 5.0f;
        reg[noReg++] = e;
    }

    static void buscar(Estudiante[] reg) {
        System.out.print("No. Control a buscar: ");
        String id = leer.next();
        for (int i = 0; i < noReg; i++) {
            if (reg[i] != null && reg[i].noControl.equals(id)) {
                System.out.println("Alumno: " + reg[i].nombre + " | Promedio: " + reg[i].promedio);
                return;
            }
        }
        System.out.println("No encontrado.");
    }

    static void eliminar(Estudiante[] reg) {
        System.out.print("No. Control a eliminar: ");
        String id = leer.next();
        for (int i = 0; i < noReg; i++) {
            if (reg[i] != null && reg[i].noControl.equals(id)) {
                reg[i] = null;
                System.out.println("Registro eliminado.");
                return;
            }
        }
    }

    static void informe(Estudiante[] reg) {
        System.out.println("
No.Ctrl	Nombre	Paterno	Promedio");
        for (int i = 0; i < noReg; i++) {
            if (reg[i] != null) {
                System.out.println(reg[i].noControl + "	" + reg[i].nombre + "	" + reg[i].apePat + "	" + reg[i].promedio);
            }
        }
    }
}
