package com.mycompany.app;
import java.util.Arrays;
/**
 * 
 *
 */
public class ArrayManipulator
{

  public static int[] mergeAndSort(int[] a, int[] b) {
    int[] c = new int[a.length+b.length];
    for(int i = 0; i < a.length; i++) {
      c[i] = a[i];
    }
    for(int i = 0; i < b.length; i++) {
      c[a.length+i] = b[i];
    }
    Arrays.sort(c);
    return c;
  }
}
