// Ameer Alnasser + Nakib Abedin + Alif Rahman
// APCS pd06
// L04: Never Fear, Big O is Here!
// 2022-01-010m
// time spent: 2.0 hrs

import java.util.ArrayList;

public class Sorts{

  // Class sort to implement all of the sort methods that we learn
  public static void bubble( ArrayList<Comparable> data){
    int bubblePassCtr = 0;
    int bubbleCompCtr = 0;
    int bubbleSwapCtr = 0;
    int temp = 0;
    for (int x = data.size()-1; x > 0; x--) {
      temp = bubbleSwapCtr;
      for (int i = 0; i < x; i++) {
        Comparable n = data.get(i);
        Comparable m = data.get(i+1);

        if (n.compareTo(m)>0) {
          data.set(i+1, n);
          data.set(i, m);
          bubbleSwapCtr += 1;
        }
        bubbleCompCtr += 1;
      }
      bubblePassCtr += 1;
      if (bubbleSwapCtr == temp) {
        break;
      }
    }
    System.out.println("Bubble sort on an array of size " + data.size() + " took " + bubblePassCtr + " passes, " + bubbleCompCtr + " comparisons, and " + bubbleSwapCtr + "swaps");

  } //end bubbleSort

  public static void selection( ArrayList<Comparable> data ){
     int maxPos;
     Comparable temp;

     int selectionPassCtr = 0;
     int selectionCompCtr = 0;
     int selectionSwapCtr = 0;

     for(int pass=data.size()-1; pass > 0 ;pass--) {

       maxPos=0;

       for(int i=0; i <= pass; i++) {
         if(data.get(i).compareTo(data.get(maxPos)) >= 0){
           maxPos = i;
         }
         selectionCompCtr += 1;
       }

       temp = data.get(pass);
       data.set(pass, data.get(maxPos));
       data.set(maxPos, temp);
       selectionSwapCtr += 1;
       selectionPassCtr += 1;

     }
     System.out.println("Selection sort on an array of size " + data.size() + " took " + selectionPassCtr + " passes, " + selectionCompCtr + " comparisons, and " + selectionSwapCtr + " swaps");

   } //end selectionSort

   public static void insertion( ArrayList<Comparable> data){

     int insertionPassCtr = 0;
     int insertionCompCtr = 0;
     int insertionSwapCtr = 0;

       for(int partition = 1; partition < data.size(); partition++) {
         //partition marks first item in unsorted region

         for( int i = partition; i > 0; i-- ) {
           insertionCompCtr += 1;
           if ( data.get(i).compareTo(data.get(i-1)) < 0 ) {
             Comparable temp = data.get(i);
             data.set(i, data.get(i-1));
             data.set(i-1, temp);
             insertionSwapCtr += 1;
           }
           else
             break;
         }
         insertionPassCtr += 1;
       }
       System.out.println("insertion sort on an array of size " + data.size() + " took " + insertionPassCtr + " passes, " + insertionCompCtr + " comparisons, and " + insertionSwapCtr + " swaps");
     } //end insertion

}// end class
