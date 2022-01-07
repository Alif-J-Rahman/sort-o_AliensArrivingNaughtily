import java.util.ArrayList;

public class Sorts{
  // Class sort to implement all of the sort methods that we learn
  public static void bubble( ArrayList<Comparable> data){
    for (int x = data.size()-1; x > 0; x--) {
      for (int i = 0; i < x; i++) {
        Comparable n = data.get(i);
        Comparable m = data.get(i+1);

        if (n.compareTo(m)>0) {
          data.set(i+1, n);
          data.set(i, m);
        }
      }
    }
  }
  public static void selection( ArrayList<Comparable> data ){
     int maxPos;
     Comparable temp;

     for(int pass=data.size()-1; pass > 0 ;pass--) {

       maxPos=0;

       for(int i=0; i <= pass; i++) {
         if(data.get(i).compareTo(data.get(maxPos)) >= 0){
           maxPos = i;
         }
       }

       temp = data.get(pass);
       data.set(pass, data.get(maxPos));
       data.set(maxPos, temp);
     }
   }//end selectionSort

   public static void insertion( ArrayList<Comparable> data){
       for(int partition = 1; partition < data.size(); partition++) {
         //partition marks first item in unsorted region

         for( int i = partition; i > 0; i-- ) {

           if ( data.get(i).compareTo(data.get(i-1)) < 0 ) {
             Comparable temp = data.get(i);
             data.set(i, data.get(i-1));
             data.set(i-1, temp);
           }
           else
             break;
         }
       }
     }//end insertionSortV

}// end class
