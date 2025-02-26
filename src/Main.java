import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int n1,n2;
        double r1,r2;

        do{
            System.out.println("Ingrese el valor de n1");
            n1= tecl.nextInt();
        }while(n1<=0);
        do{
            System.out.println("Ingrese el valor de n2");
            n2= tecl.nextInt();
        }while(n2<=0);

        r1= Math.sqrt(n1);
        r2= Math.sqrt(n2);

        System.out.println("La raiz de n1 es: "+r1);
        System.out.println("La raiz de n2 es: "+r2);
    }
}