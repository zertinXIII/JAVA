package B1_VARIABLES_y_CONDICIONALES;

import utilidades.Entrada;

public class EJ1_PedirCoeficientes_2dogr {  
    public static void main(String[] args) {

        // Declaración de coeficientes ax^2 + bx + c = 0
        double a, b, c;
        // Variables para las soluciones y el discriminante
        double x1, x2, d;

        // Solicitar coeficientes al usuario
        System.out.print("Introduzca el coeficiente a: ");
        a = Entrada.real();
        
        System.out.print("Introduzca el coeficiente b: ");
        b = Entrada.real();
        
        System.out.print("Introduzca el coeficiente c: ");
        c = Entrada.real();

        // Verificar si la ecuación es de segundo grado
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a no puede ser 0).");
        } else {
            // Calcular el discriminante
            d = (b * b) - (4 * a * c);

            // Evaluar el discriminante
            if (d < 0) {
                System.out.println("No existen soluciones reales.");
            } else {
                // Calcular soluciones
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                // Mostrar soluciones
                System.out.println("Soluciones de la ecuación:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
