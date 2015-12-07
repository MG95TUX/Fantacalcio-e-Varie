/*@author Matteo Guerra - MG95TUX
  @license GNU GPL 2.0 
*/
import java.util.Scanner;
import java.lang.Math;
public class EuropaLeague{
private String squadra;
private int posizione;
private double valore;
private int checkvalue;

public EuropaLeague(String sq, int po, double va, int ch){
squadra= sq;
posizione =po;
valore=va;
checkvalue=ch;
}
public double getvalore(){return valore;}
public String getsquadra(){return squadra;}
public int getcheckvalue(){return checkvalue;}

   public static void main(String[] args){
   System.out.println("Estrazioni Random per Europa League 1.0");
   System.out.println("MG95TUX - programma rilasciato sotto GPL 2.0");
   Scanner in = new Scanner(System.in);
   EuropaLeague array[] = new EuropaLeague[8];
   int i=0;
   while (i< 8){
       int s=i+1;
       System.out.println("dammi la squadra N°" + s);
       String team= in.next();
       System.out.println("dimmi se " + team + "(squadra N°" + s +") era 3 o 4");
       int place= in.nextInt();
       if ((place != 1) && (place !=2)) throw new IllegalArgumentException();
       double value = Math.random();
       System.out.println("dimmi in che girone " + team + " (squadra N°" + s +") era (1 se a, 2 se b, 3 se c, 4 se d)");
       int check=in.nextInt();
       if ((check < 1) && (check > 4)) throw new IllegalArgumentException();
       if (place == 1){ value = value + 1;};           //evitare primi vs primi
       array[i] = new EuropaLeague(team, place, value, check);
       team =null;
       place=0;
       value=0;
       check=0;
       i++;
       }
   int h=0;
   while(h< 7){
     if (array[h].getvalore() < array[h+1].getvalore()){
        EuropaLeague temp = array[h+1];
        array[h+1] = array[h];
        array[h] = temp;
        h=0;}
     else h++;};
   int f=0;
   while(f< 4){
     int tmp1=   array[f].getcheckvalue() ;
     int tmp2=   array[f+4].getcheckvalue() ; 
     if (array[f].getcheckvalue() == array[f+4].getcheckvalue()){
          if(f+4==7){
             EuropaLeague temp = array[f+4];
             array[f+4] = array[4];
             array[4] = temp;
             f=0;}
          else {
            EuropaLeague temp = array[f+4];
            array[f+4] = array[f+5];
            array[f+5] = temp;
            f=0;};}
      else f++;
   }
   int g=0;
   while(g< 4){
   String temp1=   array[g].getsquadra() ;
   String temp2=   array[g+4].getsquadra() ;
   System.out.println(temp1 + " vs " +  temp2);
   g++;
   }

}
}    
