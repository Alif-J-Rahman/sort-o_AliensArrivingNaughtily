import java.util.ArrayList;

public class Driver{

  public static ArrayList populate( int size, int lo, int hi, ArrayList<Comparable> arr ) {
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      arr.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    shuffle(arr);
    return arr;
  }

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static void main(String[] args) {
    ArrayList<Comparable> retAL = new ArrayList<Comparable>();

    populate(10, 0, 9, retAL);
    System.out.println(retAL);

    Sorts.insertion(retAL);
    System.out.println(retAL);
    }
}
