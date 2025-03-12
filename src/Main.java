import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Random ale = new Random();
        int opc=0, tipo=0, l=0, d=0, c=0, totalLlamadas=0, m=0;
        double local=50, distancia=350, celular=150, minutos=0, mLocal=0, mDistancia=0, mCelular=0, cLocal=0, cDistancia=0,cCelular=0, totalMinutos=0, totalCosto=0;
        do{
        System.out.println("==========\n   MENÚ   \n=========="
        +"\nRegistrar Llamada ->(1)"
        +"\nMostrar Información ->(2)"
        +"\nReiniciar ->(3)"
        +"\nSalir ->(4)");
        opc= dato.nextInt();
        switch (opc){
            case 1 ->{
                System.out.println(">>>REGISTRAR LLAMADA<<<"
                        +"\nLocal ->(1)" +
                        "\nLarga Diastancia ->(2)" +
                        "\nCelular ->(3)");
                tipo = dato.nextInt();
                m=1;
                switch (tipo){
                    case 1 ->{
                        do {
                            System.out.println("Ingrese los minutos utlizados:");
                            minutos = dato.nextDouble();
                            if(minutos<0){
                                System.out.println("Ingrese un valor valido...");
                            }
                        }while (minutos<0);
                        mLocal=mLocal+minutos;
                        cLocal=minutos*local;
                        l++;
                        System.out.println("Movimiento:"
                        +"\nTotal minutos: "+mLocal
                        +"\nCosto Llamada: "+cLocal);
                    }
                    case 2 ->{
                        do {
                            System.out.println("Ingrese los minutos utlizados:");
                            minutos = dato.nextDouble();
                            if(minutos<0){
                                System.out.println("Ingrese un valor valido...");
                            }
                        }while (minutos<0);
                        mDistancia=mDistancia+minutos;
                        cDistancia=minutos*distancia;
                        d++;
                        System.out.println("Movimiento:"
                                +"\nTotal minutos: "+mDistancia
                                +"\nCosto Llamada: "+cDistancia);
                    }
                    case 3 ->{
                        do {
                            System.out.println("Ingrese los minutos utlizados:");
                            minutos = dato.nextDouble();
                            if(minutos<0){
                                System.out.println("Ingrese un valor valido...");
                            }
                        }while (minutos<0);
                        mCelular=mCelular+minutos;
                        cCelular=minutos*celular;
                        c++;
                        System.out.println("Movimiento:"
                                +"\nTotal minutos: "+mCelular
                                +"\nCosto Llamada: "+cCelular);
                    }
                    default -> {
                        System.out.println("Ingrece una opción valida....");
                        m=1;
                    }
                }
            }
            case 2 ->{
                totalMinutos=mLocal+mDistancia+mCelular;
                totalLlamadas=l+d+c;
                totalCosto=cLocal+cDistancia+cCelular;
                System.out.println(
                        "\nLocal:" +
                        "\nMinutos: "+mLocal+
                        "\nCosto: "+cLocal+
                        "\nLlamadas: "+l+
                        "\nLarga Distancia:" +
                        "\nMinutos: "+mDistancia+
                        "\nCosto: "+cDistancia+
                        "\nLlamadas: "+d+
                        "\nCelular:" +
                        "\nMinutos: "+mCelular+
                        "\nCosto: "+cCelular+
                        "\nLlamadas: "+c+
                        "\nTotal:" +
                        "\nMinutos totales: "+totalMinutos+
                        "\nCosto totales: "+totalCosto+
                        "\nLlamadas totales: "+totalLlamadas);
                m=1;
            }
            case 3 ->{
                l=0; d=0; c=0; totalLlamadas=0; m=0;
                minutos=0; mLocal=0; mDistancia=0; mCelular=0; cLocal=0; cDistancia=0;cCelular=0; totalMinutos=0; totalCosto=0;
                System.out.println("Se reinicio con exito...");
                m=1;
            }
            case 4 ->{
                m=0;
            }
            default -> {
                System.out.println("Ingrece una opción valida....");
                m=1;
            }
        }}while(m==1);

    }
}