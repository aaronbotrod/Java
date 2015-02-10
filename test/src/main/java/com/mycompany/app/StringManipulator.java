package com.mycompany.app;

/**
 * 
 *
 */
public class StringManipulator
{
  public static String reverse(String str) {
    StringBuffer strBuffer = new StringBuffer(str);
    strBuffer.reverse();
    return strBuffer.toString();
  }
}
