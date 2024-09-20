import java.util.Scanner;

static String con1 ="1";
static String con2 ="2";
static String con3 ="3";

public class Main {
    
    public static void main(String [] args) throws Exception{
      
        Scanner entrada= new Scanner (System.in);
        System.out.println("ingrese numero de cedula");
        String numcedula = entrada.nextline[];

        System.out.prinln("su numero de cedula ea:" + numcedula);


     cedula(numcedula);


    }

    public static String cedula(String num){

        if (num.contains(con1)){
            System.out.printl("su puesto de votacion es en soacha");

        }else if (num.startswith(con2)){
            System.out.printl("su puesto de votacion es en Funza");

        }
        else if (num.contains(con3)){
            System.out.printl("su puesto de votacion es en madrid")
        }
        return num;
    }
}
