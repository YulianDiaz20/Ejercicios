import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Random ale = new Random();

        int opc=0,m=0;
        double num, resultado;
        do{
        System.out.println(
                "================\n      MENÚ      \n================"
        +"\nCelsius a Fahrenheit->(1)\nCelsius a Kelvin->(2)\nCelsius a Rankine->(3)\nCelsius a Réaumur->(4)"
        +"\nFahrenheit a Celsius->(5)\nFahrenheit a Kelvin->(6)\nFahrenheit a Rankine->(7)\nFahrenheit a Réaumur->(8)"
        +"\nKelvin a Celsius->(9)\nKelvin a Fahrenheit->(10)\nKelvin a Rankine->(11)\nKelvin a Réaumur->(12)"
        +"\nRankine a Celsius->(13)\nRankine a Fahrenheit->(14)\nRankine a Kelvin->(15)"
        +"\nSalir->(16)");
        opc = dato.nextInt();
        switch (opc){
            case 1->{
                do {
                    System.out.println("Ingrese los Celcius: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                    resultado = (num * (9 / 5)) + 32;
                    System.out.println("El resultado es:\nFahrenheit (°F):" + resultado);
            }
            case 2->{
                do {
                System.out.println("Ingrese los Celcius: ");
                num = dato.nextDouble();
                if(num<0){
                    System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                }
            }while(num<0);
                resultado = num+273.15;
                System.out.println("El resultado es:\nKelvin (K):"+resultado);
            }
            case 3->{
                do {
                System.out.println("Ingrese los Celcius: ");
                num = dato.nextDouble();
                if(num<0){
                    System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                }
            }while(num<0);
                resultado = (num+273.15)*(9/5);
                System.out.println("El resultado es:\nRankine (°R):"+resultado);
            }
            case 4->{
                do {
                System.out.println("Ingrese los Celcius: ");
                num = dato.nextDouble();
        if(num<0){
            System.out.println("Porfavor ingresa un número mayor o igual a cero...");
        }
    }while(num<0);
                resultado = num*(4/5);
                System.out.println("El resultado es:\nRéaumur (°Re):"+resultado);
            }
            case 5->{
                do {
                    System.out.println("Ingrese los Fahrenheit: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = (num-32)*(5/9);
                System.out.println("El resultado es:\nCelsius (°C):"+resultado);
            }
            case 6->{
                do {
                    System.out.println("Ingrese los Fahrenheit: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = ((num-32)*(5/9))+273.15;
                System.out.println("El resultado es:\nKelvin (K):"+resultado);

            }
            case 7->{
                do {
                    System.out.println("Ingrese los Fahrenheit: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = num+459.67;
                System.out.println("El resultado es:\nRankine (°R):"+resultado);

            }
            case 8->{
                do {
                    System.out.println("Ingrese los Fahrenheit: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = (num-32)*(4/9);
                System.out.println("El resultado es:\nRéaumur (°Re):"+resultado);

            }
            case 9->{
                do {
                    System.out.println("Ingrese los Kelvin: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = num-273.15;
                System.out.println("El resultado es:\nCelcius (°C):"+resultado);
            }
            case 10->{
                do {
                    System.out.println("Ingrese los Kelvin: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = ((num-273.15)*(9/5))+32;
                System.out.println("El resultado es:\nFahrenheit (°F):"+resultado);
            }
            case 11->{
                do {
                    System.out.println("Ingrese los Kelvin: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = num*(9/5);
                System.out.println("El resultado es:\nRankine (°R):"+resultado);
            }
            case 12->{
                do {
                    System.out.println("Ingrese los Kelvin: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = (num-273.15)*(4/5);
                System.out.println("El resultado es:\nRéaumur (°Re):"+resultado);
            }
            case 13->{
                do {
                    System.out.println("Ingrese los Rankine: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = (num-491.67)*(5/9);
                System.out.println("El resultado es:\nCelcius (°C):"+resultado);
            }
            case 14->{
                do {
                    System.out.println("Ingrese los Rankine: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = num-459.67;
                System.out.println("El resultado es:\nFahrenheit (°F):"+resultado);
            }
            case 15->{
                do {
                    System.out.println("Ingrese los Rankine: ");
                    num = dato.nextDouble();
                    if(num<0){
                        System.out.println("Porfavor ingresa un número mayor o igual a cero...");
                    }
                }while(num<0);
                resultado = num*(5/9);
                System.out.println("El resultado es:\nKelvin (K):"+resultado);
            }
            case 16->{
                System.out.println("Gracias por usar nuestra calculadora....");
                m=1;
            }
            default -> {
                System.out.println("Ingrese una opción valida...");
            }

        }}while(m==0);
    }
}