package inicio.resumenbancario;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/*
 El resumen bancario del clinte tiene los últimos 4 mov de su cuenta
 Los mov tienen fecha, importe y pueden ser retiros o depósitos
 Se pide ingresar los movimientos y luego listarlos.
 Vamos a listarlos ordenados de menor a mayor:
 - Entre las fechas dadas.
 - Todos.
 */
public class AppResumenBancario {
    private static final int CANT_MOV=3;
    static String fechaIngresada;


    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Movimiento[] movs = new Movimiento[CANT_MOV];
        for (int i = 0; i < CANT_MOV ; i++) {

            System.out.println("Ingrese fecha del movimiento:");
            fechaIngresada = scan.next();


            System.out.println("Ingrese importe del movimiento:");

            float importe = scan.nextFloat();

            SimpleDateFormat simpleDate = new SimpleDateFormat("ddMMyyyy");
            Date fecha = simpleDate.parse(fechaIngresada);

            int tipo;
            System.out.println("Ingrese tipo 1) Retiro 2) Deposito");
            int opc = scan.nextInt();

            if (opc == 1){Retiro retiro = new Retiro (importe,fecha);
            movs [i] = retiro;
            } else {
                Deposito deposito = new Deposito (importe, fecha);
                movs [i] = deposito;

            }

                }
        Date fechaObt;
        System.out.println("Fechas sin rodenar");
            for (int j = 0; j < movs.length; j++) {
                System.out.println(movs[j]);
               // fechaObt = movs[j].getFecha();
            }


        Movimiento aux = null;
        System.out.println("Fechas ordenadas");
        for (int i = 0; i < movs.length; i++) {
            for (int j = 0; j < movs.length; j++) {
                fechaObt = movs [j+1].getFecha();
                if (movs[j+1].getFecha().before(movs[j].getFecha())){
                    aux = movs[j+1];
                    movs[j+1]= movs[j];
                    movs[j] = aux;

                }
            }
            System.out.println(movs[i]);
        }
    }
}



        /*int aux = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
              if (vector[j+1] < vector[j]) {
                  aux = vector[j+1];
                  vector [j+1] = vector [j];
                  vector [j] = aux;
              }
            }
            
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("i = " + i);   
        }

    }*/

