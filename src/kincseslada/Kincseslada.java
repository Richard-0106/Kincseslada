
package kincseslada;

import java.util.Scanner;


public class Kincseslada {
    
     private Lada lada1, lada2 ,lada3;
     static private int valasz;
     static Scanner scr=new Scanner(System.in);
   
    public void indit(){
    lada1 = new Lada("Én rejtem a kincset","Arany");
    lada2 = new Lada("nem én rejtem a kincset","Ezüst");
    lada3 = new Lada("az aranyláda felirata hazugság","Bronz");
    
    }
   
   public static void main(String[] args) {
       
               
    }
   
 
   private static void melyik() {
        System.out.print("Melyik ládában van a kincs?:");
        valasz = scr.nextInt();
      
        while(valasz < 1 || valasz > 3) {
            System.out.println("Nem jó értéket adtál meg!");
            valasz = scr.nextInt();
        }
        if(valasz==2){
            System.out.println("Helyes a válasz");
        }
        else{
            System.out.println("Rossz a válasz");
        }
}

}
