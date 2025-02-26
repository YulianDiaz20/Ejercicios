import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int peso;
        double estatura,total;

        do{
            System.out.println("Ingrese su peso: ");
            peso = tecl.nextInt();
        }while(peso<=0);
        do{
            System.out.println("Ingrese su estatura: ");
            estatura = tecl.nextDouble();
        }while(estatura<=0);
        total = peso/(estatura*estatura);
        if(total<=18.49){
            System.out.println("Su IMC es: "+total+"\nClasificación: Peso Bajo");
        }else if(total<=24.99){
            System.out.println("Su IMC es: "+total+"\nClasificación: Peso Normal");
        }else if(total<=29.99){
            System.out.println("Su IMC es: "+total+"\nClasificación: Sobrepeso");
        }else if(total<=34.99){
            System.out.println("Su IMC es: "+total+"\nClasificación: Obesidad leve");
        }else if(total<=39.99){
            System.out.println("Su IMC es: "+total+"\nClasificación: Obesidad mediana");
        }else{
            System.out.println("Su IMC es: "+total+"\nClasificación: Obesidad Mórbida");
        }
    }
}