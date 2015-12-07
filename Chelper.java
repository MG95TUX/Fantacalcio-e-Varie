/*@author Matteo Guerra - MG95TUX
  @license GNU GPL 2.0 
*/
public class Chelper{
private String squadra;
private int posizione;
private double valore;
private int checkvalue;

public Chelper(String sq, int po, double va, int ch){
squadra= sq;
posizione =po;
valore=va;
checkvalue=ch;
}
public double getvalore(){return valore;}
public String getsquadra(){return squadra;}
public int getcheckvalue(){return checkvalue;}
}
