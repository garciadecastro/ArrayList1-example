package income;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @garciadecastro
 */
public class Income {

     public static void main(String[] args) {
     ArrayList<Integer> incomes = saveIncomes();
     double sum = calculateSum(incomes);
     double mean = sum / incomes.size();
     Comparator<Integer> comparator = Collections.reverseOrder();
     Collections.sort(incomes, comparator);
     System.out.println("");
     System.out.println("Max: " + Collections.max(incomes));
     System.out.println("Min: " + Collections.min(incomes));
     System.out.println("");
     showResults(incomes, sum, mean);
     System.out.println("");
     System.out.println("List: " + incomes);
     System.out.println("");
     
      
    }
    
     public static ArrayList<Integer> saveIncomes() {
        ArrayList<Integer> incomes = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter an amount. Enter -1 to finish: ");
        n = sc.nextInt();
        while (n != -1) {
                 incomes.add(n);
                 System.out.print("Enter an amount. Enter -1 to finish: ");
                 n = sc.nextInt();
        }
        return incomes;
   }
     
      public static double calculateSum(ArrayList<Integer> incomes) {
         double sum = 0;
         Iterator it = incomes.iterator();
         while (it.hasNext()) {
                  sum = sum + (Integer) it.next();
                 // next () returns a data of type Object. You have to convert it to Integer
         }
         return sum;
   }
      
       public static void showResults(ArrayList<Integer> incomes, double sum, double mean) {
         int cont = 0;
         System.out.println("Sum: " + sum);
         System.out.printf("Meam: %.2f %n", mean);
         for (Integer i : incomes) {
               if (i > mean) {
                  cont++;
              }
         }
      System.out.println(cont + " Amounts above average");
   }
}
