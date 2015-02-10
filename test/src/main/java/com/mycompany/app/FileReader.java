package com.mycompany.app;
import java.io.FileInputStream;
import java.util.Scanner;
/**
 * 
 *
 */
public class FileReader
{

  public static String getFileContent(String filename) {
    Scanner fileScanner;
    StringBuffer content = new StringBuffer();
    System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
    try{
        fileScanner = new Scanner(new FileInputStream(filename));
        if(fileScanner.hasNextLine()){
          content.append(fileScanner.nextLine());
        }
        while(fileScanner.hasNextLine()) {
          content.append("\n"+fileScanner.nextLine());
        }
        
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    return content.toString();
  }
}
