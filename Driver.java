// Ameer Alnasser + Nakib Abedin + Alif Rahman
// APCS pd06
// L04: Never Fear, Big O is Here!
// 2022-01-010m
// time spent: 2.0 hrs

import java.util.ArrayList;

public class Driver{

  public static ArrayList populate(ArrayList<Comparable> arr ) {
    arr.add(12);
    arr.add(7);
    arr.add(5);
    arr.add(3);
    arr.add(1);

    return arr;
  }

  public static ArrayList populate2(ArrayList<Comparable> arr ) {
    arr.add(1);
    arr.add(3);
    arr.add(5);
    arr.add(7);
    arr.add(12);

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
    ArrayList<Comparable> arr1 = new ArrayList<Comparable>();
    ArrayList<Comparable> arr2 = new ArrayList<Comparable>();
    ArrayList<Comparable> arr3 = new ArrayList<Comparable>();
 ArrayList<Comparable> arr4 = new ArrayList<Comparable>();
 ArrayList<Comparable> arr5 = new ArrayList<Comparable>();
 ArrayList<Comparable> arr6 = new ArrayList<Comparable>();
    populate(arr1);
    System.out.println(arr1);

    Sorts.bubble(arr1);
    System.out.println("testing bubbleSort: " + arr1);

    populate(arr2);
    System.out.println(arr2);

    Sorts.selection(arr2);
    System.out.println("testing selectionSort: " + arr2);

    populate(arr3);
    System.out.println(arr3);

    Sorts.insertion(arr3);
    System.out.println("testing insertionSort: " + arr3);
//
    populate(arr4);
    System.out.println(arr4);

    Sorts.bubble(arr4);
    System.out.println("testing bubbleSort: " + arr4);

    populate(arr5);
    System.out.println(arr5);

    Sorts.selection(arr5);
    System.out.println("testing selectionSort: " + arr5);

    populate(arr6);
    System.out.println(arr6);

    Sorts.insertion(arr6);
    System.out.println("testing insertionSort: " + arr6);

    }
}
