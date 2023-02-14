import java.util.Scanner;

public class DoWhile {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("seleciona el numeor de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("elige la opcion correcta");
            }
        }while (response != 0);
        System.out.println("se termino el programa");


        //while

        turnOnOffLigjt();
        int i = 1;
        while (isTurnOnLight && i<=10){

            printSOS();
            i++;
        }

        //for

        for (int j = 1; j <= 10; j++) {
            printSOS();

        }


    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }
    public static boolean turnOnOffLigjt(){
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
