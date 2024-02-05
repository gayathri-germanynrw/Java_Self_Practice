package day09_practice_tasks;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items={"Shoes","Gloves","Jacket","Airpods","iPad","iPhone 12 case"};
        double[] prices={99.99,150.0,9.99,250.0,439.50,39.5099};
        int[] itemIDs={12345,12346,12347,12348,12349,123};
        getIndexPrint(items,prices,itemIDs);
    }
         public static void getIndexPrint(String[] items,double[] prices,int[] itemIDs){

             Arrays.sort(items);
             System.out.println("The index of Gloves\t"+ Arrays.binarySearch(items,"Gloves"));
             boolean isItemAvailable=false;
             for(String val:items){
                 if(val.equalsIgnoreCase("iPad")) isItemAvailable=true;
             }
             System.out.println("isItemAvailable = " + isItemAvailable);
             // name - price - #ID
             for(int i=0;i<items.length;i++){
                 System.out.println("The name  -" + items[i]+ " -price is "+prices[i]+"   #ID - "+itemIDs[i]);
             }



         }


}
