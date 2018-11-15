import java.util.ArrayList;

import java.util.Enumeration;

import java.util.Hashtable;

public class AlgoritmaHashTable {
    public static void main(String args[]) {
      // Create a hash map
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("Rifai", new Double(16.17));
      balance.put("Muhammad", new Double(10.11));
      balance.put("wiah", new Double(18.19));
      balance.put("syawiah", new Double(3.4));
      balance.put("Afif", new Double(12.13));

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      // Deposit 1,000 into Ara's account
      bal = ((Double)balance.get("Ara")).doubleValue();
      balance.put("Zara", new Double(bal+1000));
      System.out.println("Zara's new balance: " +
      balance.get("Zara"));
   }
    
}
