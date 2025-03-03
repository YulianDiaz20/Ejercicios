import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Random ale = new Random();
        int dinero, num, n=0, m=0;
        String resp;

        System.out.println("Ingresa el valor a apostar: ");
        dinero = dato.nextInt();
        do{
        num = ale.nextInt((3-1+1))+1;
        System.out.println("Número: "+num);
        if(num == 1){
           dinero= dinero*2;
            System.out.println("Multiplica por dos"+"\nSaldo total: "+dinero);
           System.out.println("Deseas continuar (si||no): ");
           resp = dato.next();
           do{
               m=0;
           if(resp.toUpperCase().equals("SI")){
               n=1;
           }else if(resp.toUpperCase().equals("NO")){
               n=0;
           }else{
               System.out.println("Por favor ingresa si||no...");
               m=1;
           }}while(m==1);
        }else if(num == 2){
            dinero = dinero/2;
            System.out.println("Pierde la mitad"+"\nSaldo total: "+dinero);
            System.out.println("Deseas continuar (si||no): ");
            resp = dato.next();
            do{
                m=0;
            if(resp.toUpperCase().equals("SI")){
                n=1;
            }else if(resp.toUpperCase().equals("NO")){
                n=0;
            }else{
                System.out.println("Por favor ingresa si||no...");
                m=1;
            }}while(m==1);
        }else if(num == 3){
            dinero= 0;
            System.out.println("Pierde todo"+"\nSaldo total: "+dinero);
            n=0;
        }
        }while(n==1);
        System.out.println("Gracias por jugar, vuelve pronto....\nTu saldo final es: "+dinero);

    }
}