/*@author Matteo Guerra - MG95TUX
  @license GNU GPL 2.0 
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
public class Gironi{
String nome;
double numero;
   public Gironi(String n, double v){
         nome = n;
         numero = v;}

   public double getvalore(){ return numero;}
   
   public String getsquadra(){ return nome;}  

   public static void main(String[] args){
   System.out.println("Estrazioni random per assegnazioni gironi");
   System.out.println("MG95TUX - programma rilasciato sotto GPL 2.0");
      boolean flag = true;
          while (flag){
              Scanner s = new Scanner(System.in);
              boolean gg= true;
              int bbb=0;
              while (gg != false){
                try  {gg = true;
                      Scanner base = new Scanner(System.in);
                      System.out.println("inserisci il numero di squadre qui:");
                      bbb= base.nextInt();
                      gg= false;
                      
                     
                      }
                catch ( InputMismatchException e){
                      System.out.println("Scrivimi roba decente!");
              /*       String cazzata =s.next();*/
                      /*gg= false;*/}
                 }
              final int x= bbb;
              System.out.println("inserisci il numero di gironi qui:");
              final int g= s.nextInt();
              Gironi[] array = new Gironi[x];
              int i = 0;
              while(i<x){
                 int mm= i+1;
                 System.out.println("inserisci il nome della " + mm + " squadra qui:");
                 String m = s.next();
                 double value= Math.random();
                 array[i]= new Gironi(m,value);
                 m=null;
                 value= 0;
                 i++;}

          int z=0;
          int l = x-1;
          while(z<l) {
              if (array[z].getvalore() > array[z+1].getvalore()) {
                    Gironi temp = array[z+1];
                    array[z+1] = array[z];
                    array[z]= temp;
                    z=0;}
              else
                 z++;
              }

         int componenti = (int) x/g;
         int h =0;
         int t =0;
         int p =0;
        System.out.println(" I gironi sono composti da: ");
         while (h<x){
            System.out.println(" ");
              while (t< componenti){

              System.out.print(array[h].getsquadra() + " ");
              h++;
              t++;}
         t=0;}
   System.out.println(" ");
   System.out.println("inserisci q per chiudere, qualsiasi altro tasto per reinizializzare il programma:");
   String j= s.next();
   if (j.equalsIgnoreCase("q")){
   flag=false;}
   }   
 }  
}       
