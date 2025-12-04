import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantos popochos tienes?");
        int n = scan.nextInt();


        if (n ==0) {
            System.out.println("Deberias conseguir un popocho");
            }else if (n == 1) {
                System.out.println("el popocho está muy mimado");
            }else if (n<=3) {
                System.out.println("La familia de popochos esta equilibrada");
            }else {
                System.out.println("Demasiados popochos");
            }

        for(int i=0;i<n;i++){


        System.out.println("el popocho " +(i+1) +" está ZZZzzz");
        }
        System.out.println("Todos los popochitos están durmiendo placidamente");
    }
}