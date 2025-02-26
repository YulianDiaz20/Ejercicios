import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random ale = new Random();

        int a=0, dado1, dado2, total1=0, total2=0;

        int lanzadas = ale.nextInt((100-2+1))+2;
        System.out.println("Lanzadas: "+lanzadas+"\nDado 1 || Dado 2");
        do{
            dado1 = ale.nextInt((6-1+1))+1;
            total1=dado1+total1;
            dado2 = ale.nextInt((6-1+1))+1;
            total2=dado2+total2;
            System.out.println(" "+dado1+" || "+dado2);
           a++;
        }while(a<lanzadas);
        System.out.println("TOTALES\nDado 1: "+total1+"\nDado 2: "+total2);
        if(total1>total2){
            System.out.println("Dado 1 es el GANADOR");
        }else if(total2>total1){
            System.out.println("Dado 2 es el GANADOR");
        }else if(total1==total2){
            System.out.println("EMPATE");
        }

    }
}