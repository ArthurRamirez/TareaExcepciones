import java.util.Scanner;

public class Excepciones {




    public static char caracterEn(String Palabra , int Entero) {
        char Caracter = 0;
        int position = Palabra.length();

        try {
            if (Entero > 0 && Entero <= position) {
                Caracter = Palabra.charAt(Entero);
            }
        } catch (Exception e) {
            System.out.println("El entero es mas grande que la palabra");
        }
        return Caracter;
    }

    public static void main (String [] args){
        String Palabra;
        int Entero = 7 ;
        Scanner lectTeclado = new Scanner(System.in);
        System.out.println("Agregue una palabra");
        Palabra = lectTeclado.nextLine();
        System.out.println(caracterEn(Palabra,Entero));

    }
}
