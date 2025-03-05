import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Random ale = new Random();
        int num1, num2, m=0, n=0;
        double numTotal;
        String resp;
        num1 = ale.nextInt((100-1+1))+1;
        num2 = ale.nextInt((100-1+1))+1;
        System.out.println("Números:\nPrimero: "+num1+"\nSegundo: "+num2);
        do {
            do {
                m=0;
                System.out.println("Ingresa la operación:"
                        + "\n(Suma(+)||Resta(-)||Multiplicación(*)||Divición(/)||Potencia(^)||Modulo(%))");
                resp = dato.next();
                switch (resp) {
                    case "+" -> {
                        numTotal = num1 + num2;
                        System.out.println(num1 + "+" + num2 + "=" + numTotal);
                    }
                    case "-" -> {
                        numTotal = num1 - num2;
                        System.out.println(num1 + "-" + num2 + "=" + numTotal);
                    }
                    case "*" -> {
                        numTotal = num1 * num2;
                        System.out.println(num1 + "*" + num2 + "=" + numTotal);
                    }
                    case "/" -> {
                        numTotal = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "=" + numTotal);
                    }
                    case "^" -> {
                        numTotal = Math.pow(num1,num2);
                        System.out.println(num1 + "^" + num2 + "=" + numTotal);
                    }
                    case "%" -> {
                        numTotal = num1 % num2;
                        System.out.println(num1 + "%" + num2 + "=" + numTotal);
                    }
                    default -> {
                        m = 1;
                    }
                }
            } while (m == 1);
            do {
                n=0;
                System.out.println("¿Quieres hacer otra operación? (si||no)");
                resp = dato.next();
                if(!resp.toUpperCase().equals("SI") && !resp.toUpperCase().equals("NO")){
                    n=1;
                    System.out.println("Porfavor ingresa una respuesta valida...");
                }
            }while(n==1);
        }while(resp.toUpperCase().equals("SI"));
        System.out.println("Gracias por la atención...");



    }
}