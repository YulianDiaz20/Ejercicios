import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Random ale = new Random();
        String opc, opc1, nombre, telefono;
        int mouse=0, teclado=0, monitor=0, discos=0, usb=0;
        double carrito=0,total=0, iva, totalFinal;
        do{
        System.out.println("======================"
                +"\n>>>>>>TECNOLOGIA<<<<<<"
                +"\n======================"
                +"\n1.Mouse ----->$85.000"
                +"\n2.Teclado --->$230.000"
                +"\n3.Monitor --->$940.000"
                +"\n4.Disco Duro >$220.000"
                +"\n5.USB ------->$60.000"
        +"\nEscribe el número del producto a comprar:");
        opc = dato.next();
       switch(opc){
           case "1"->{
              carrito=carrito+85000;
              System.out.println("Se agrego correctamente..."
                      +"\nCarrito: $"+carrito
                      +"\nPara finalizar compra escribe 'Fin'"
              +"\nPara agregar otro producto escribe 'Con'");
              opc1 = dato.next();
              mouse++;
           }
           case "2"->{
               carrito=carrito+230000;
               System.out.println("Se agrego correctamente..."
                       +"\nCarrito: $"+carrito
                       +"\nPara finalizar compra escribe 'Fin'"
                       +"\nPara agregar otro producto escribe 'Con'");
               opc1 = dato.next();
               teclado++;
           }
           case "3"->{
               carrito=carrito+940000;
               System.out.println("Se agrego correctamente..."
                       +"\nCarrito: $"+carrito
                       +"\nPara finalizar compra escribe 'Fin'"
                       +"\nPara agregar otro producto escribe 'Con'");
               opc1 = dato.next();
               monitor++;
           }
           case "4"->{
               carrito=carrito+220000;
               System.out.println("Se agrego correctamente..."
                       +"\nCarrito: $"+carrito
                       +"\nPara finalizar compra escribe 'Fin'"
                       +"\nPara agregar otro producto escribe 'Con'");
               opc1 = dato.next();
               discos++;
           }
           case "5"->{
               carrito=carrito+60000;
               System.out.println("Se agrego correctamente..."
                       +"\nCarrito: $"+carrito
                       +"\nPara finalizar compra escribe 'Fin'"
                       +"\nPara agregar otro producto escribe 'Con'");
               opc1 = dato.next();
               usb++;
           }
           default -> {
               System.out.println("Escribe una opción valida...");
               opc1 = "con";
           }
       }}while(opc1.toUpperCase().equals("CON"));
        switch (opc1.toUpperCase()){
            case "FIN" ->{
                System.out.println("Porfavor ingresa tu nombre:");
                nombre = dato.next();
                System.out.println("Porfavor ingresa tu telefono:");
                telefono = dato.next();
                System.out.println(
                        "Factura de Venta"
                        +"\nTienda Tecnología\n"
                        +nombre+"    "+telefono
                                +"\nProducto:       Cantidad:    Valor UND:    Valor Total:"
                );
                if(mouse>0){
                    total=mouse*85000;
                    System.out.println(
                                   "Mouse              "+mouse+"       $85.000         $"+total
                    );
                }
                if(teclado>0){
                    total=teclado*230000;
                    System.out.println(
                            "Teclado            "+teclado+"       $230.000        $"+total
                    );
                }
                if(monitor>0){
                    total=monitor*940000;
                    System.out.println(
                            "Monitor            "+monitor+"       $940.000        $"+total
                    );
                }
                if(discos>0){
                    total=discos*220000;
                    System.out.println(
                            "Discos Duros       "+discos+"       $220.000        $"+total
                    );
                }
                if(usb>0){
                    total=usb*60000;
                    System.out.println(
                            "USB                "+usb+"       $60.000         $"+total
                    );
                }
                iva=carrito*0.16;
                totalFinal=iva+carrito;
                System.out.println("Total sin Iva: $"+carrito+"\nIva: $"+iva+"\nTotal a pagar: $"+totalFinal);
            }
            default -> {

            }
        }
    }
}