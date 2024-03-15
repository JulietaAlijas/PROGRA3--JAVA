// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code
import  java.util.Scanner;
public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.printf("---- EJERCICIOS---------------"); // IMPRIME POR PANTALLA
        System.out.println(); // IMPRIME Y HACE EL SALDO DE LINEA
        //boolean activo =false;

        //EJERCICIO 1
        /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya
        inicializados e ingreso por teclado.

        int[] arreglo= new int [] {2,4,6};
        int dim=3;
        int[] arreglo2= new int[dim];

        for(int i=0; i<dim; i++) {
            arreglo2[i]= scanner.nextInt();
        }
        long prom = CalcularPromedio (arreglo, 3);
        System.out.println("EL PRIMEDIO DEL PRIMER ARREGLO ME DA: " + prom);
        long prom2 = CalcularPromedio (arreglo2, 3);
        System.out.println("EL PRIMEDIO DEL SEGUNDO ARREGLO ME DA: " + prom2);

        // Ejercicio nº2: Calcular si un número es par o no.

        System.out.printf("INGRESE UN NUMERO: ");
        int dato=scanner.nextInt();

        if (dato % 2 == 0 )
            System.out.println("El numero es par!! ");
        else
            System.out.println("El numero es IMPAR");
*/

        //Ejercicio nº3: Mostrar los primeros 100 números primos.
        int contador=0; // numero contador para llegar hasta 100
        int num=0;
        while(contador<=100)
        {

            if (((num % 2) != 0) && ((num % 3)  != 0) && ((num % 5)  != 0) && ((num % 7)  != 0))
            {
                System.out.println("Numero Primo: " + num);
                contador++;
            }
            if ((num ==2) || (num ==3) || (num == 5) || (num ==7))
            {
                System.out.println("Numero Primo: " + num);
                contador++;
            }
            num++;
        }




/*
        // VERSION 2 DE NUMERO PRIMO
        int i=0;
        int cantPrimos=0;
        while (cantPrimos <100)
        {
            boolean esPrimo= true;
            for(int j=2; j<i; j++)
            {
                if (i%j ==0)
                {
                    esPrimo=false;
                }
            }

            cantPrimos++;
            i++;
        }*/



        //Ejercicio nº4: Mostrar los primeros n números primos.
        //
        //Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.
        //
        //Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
        //
        //Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
        //
        //Ejercicio nº9: Revisar si un año es bisiesto o no.
        //
        //Ejercicio nº10: Encontrar el valor ASCII de un carácter.
        //
        //Ejercicio nº11: Multiplicar dos números.
        //
        //Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.




        scanner.close();


    }
    //FUNCION DE RECORRER UN ARREGLO Y SACAR PROMEDIO
    public static long CalcularPromedio (int[] arreglo, int dim)
    {
        int acumulador=0;
        for(int i=0; i<dim; i++)
        {
            acumulador +=  arreglo[i];
        }

        long prom= acumulador / dim;
        return prom;
    }


}

