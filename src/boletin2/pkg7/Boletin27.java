/*renda mensual para o prestamo*/
package boletin2.pkg7;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin27 {

    public static void main(String[] args) {
    double n , i , t , rendamensual ;
    System.out.println("nominal=");
    Scanner dato=new Scanner(System.in);
    n=dato.nextDouble();
    System.out.println("%interes anual=");
    Scanner dato1=new Scanner(System.in);
    i=dato1.nextDouble();
    System.out.println("nº de anos");
    Scanner dato2=new Scanner(System.in);
    t=dato2.nextDouble();
    rendamensual=(n*i*t)/1200 ;
    System.out.println("Renda mensual="+rendamensual);
    
    }
    
}
