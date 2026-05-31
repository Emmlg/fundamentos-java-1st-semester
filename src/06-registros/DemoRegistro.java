/**
 * EJERCICIO: Demostración de Registros (Sistema de Estudiantes)
 * ---------------------------------------------------------------
 * Concepto: Clases internas (registros), arreglos de objetos y CRUD básico.
 * 
 * DESCRIPCIÓN: 
 * Simula una base de datos de estudiantes utilizando una clase interna 
 * para agrupar datos (No. Control, Nombre, Apellidos, Género, Edad).
 * Implementa funciones de Añadir, Buscar, Eliminar e Informe General.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package registros;

import java.util.Scanner;

public class DemoRegistro {
    
    static Scanner leer = new Scanner(System.in);
    static int NoReg = 0;
    static final int TAMANIO = 10;

    // Definición del "Registro" mediante una clase interna
    static class DatosEstudiante {
        String noCtrl, nombre, apePat, apeMat;
        char genero;
        int edad;
    }

    public static void main(String[] args) {
        DatosEstudiante[] vecRegEst = new DatosEstudiante[TAMANIO];
        int opcion;

        do {
            System.out.println("
--- CONTROL DE ESTUDIANTES ---");
            System.out.println("1. Añadir");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Informe general");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1: añadirEstudiante(vecRegEst); break;
                case 2: buscarEstudiante(vecRegEst); break;
                case 3: eliminarEstudiante(vecRegEst); break;
                case 4: mostrarInforme(vecRegEst); break;
            }
        } while (opcion != 5);
    }

    static void añadirEstudiante(DatosEstudiante[] vec) {
        if (NoReg >= TAMANIO) {
            System.out.println("Error: Espacio insuficiente.");
            return;
        }
        DatosEstudiante est = new DatosEstudiante();
        System.out.print("No. Control: "); est.noCtrl = leer.next();
        System.out.print("Nombre: "); est.nombre = leer.next();
        System.out.print("Apellido Paterno: "); est.apePat = leer.next();
        System.out.print("Apellido Materno: "); est.apeMat = leer.next();
        System.out.print("Género (M/F): "); est.genero = leer.next().charAt(0);
        System.out.print("Edad: "); est.edad = leer.nextInt();
        
        vec[NoReg++] = est;
        System.out.println("Registro añadido correctamente.");
    }

    static void buscarEstudiante(DatosEstudiante[] vec) {
        System.out.print("No. Control a buscar: ");
        String buscado = leer.next();
        for (int i = 0; i < NoReg; i++) {
            if (vec[i] != null && vec[i].noCtrl.equals(buscado)) {
                System.out.println("Encontrado: " + vec[i].nombre + " " + vec[i].apePat);
                return;
            }
        }
        System.out.println("No se encontró el estudiante.");
    }

    static void eliminarEstudiante(DatosEstudiante[] vec) {
        System.out.print("No. Control a eliminar: ");
        String buscado = leer.next();
        for (int i = 0; i < NoReg; i++) {
            if (vec[i] != null && vec[i].noCtrl.equals(buscado)) {
                vec[i] = null; // En una implementación real, se debería compactar el arreglo
                System.out.println("Registro eliminado.");
                return;
            }
        }
    }

    static void mostrarInforme(DatosEstudiante[] vec) {
        System.out.println("
No.Ctrl	Nombre	Paterno	Edad");
        for (int i = 0; i < NoReg; i++) {
            if (vec[i] != null) {
                System.out.println(vec[i].noCtrl + "	" + vec[i].nombre + "	" + vec[i].apePat + "	" + vec[i].edad);
            }
        }
    }
}
