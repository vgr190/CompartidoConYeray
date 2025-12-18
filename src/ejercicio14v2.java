


import java.util.Scanner;

    public class ejercicio14v2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //14.	Programa que lea de forma repetida un número N. Para cada número leído calculará
            //y mostrará la suma 1+2+3+...+N. Cada vez que muestre el resultado el programa preguntará
            //al usuario si desea continuar,
            //si se introduce s el programa continuará. En caso contrario finalizará.


            char respuesta;
            do {
                System.out.println("introduce el numero");
                int n = scan.nextInt();
                scan.nextLine();   //limpiar el buffer
                int suma=0;
                for(	;n>=1;n--) {
                    suma += n;
                }
                System.out.println("La suma es: "+suma);

                System.out.println("Desea continuar(s/n)");
                respuesta= scan.nextLine().charAt(0);

            }while(respuesta == 's');

            System.out.println("Esto lo ha hecho yeray");

        }

}
