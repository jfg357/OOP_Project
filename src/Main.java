/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is the main driving class for the project
 *
 * <p>This is a <a href="package-summary.html">driving method</a>
 *
 * @author Juan Gaviria
 * @version 0.12
 * @serial
 * @since 0.1
 */

public class Main {

  /**
   * @param args for the default main
   */
  public static void main(String[] args) {
    AudioPlayerDriver.testAudioPlayer();
    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();
    AudioPlayerDriver.testAudioPlayer();

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products;

    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();

    // Write one line of code to sort the ArrayList

    Collections.sort(products);

    // Call the print method on the ArrayList
    //print(products);

    // Step 18
    /*System.out.println("Test Employee Info");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.getCode());*/

    // Step 19
   /* System.out.println("Test Employee Department ID");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());*/

    // Step 20-21
    System.out.println("Store the results");
    EmployeeInfo employee = new EmployeeInfo();
    new ProcessFiles(employee);
    new ProcessFiles(products);

  }

  // Step 15
  // Complete the header for the testCollection method here

  /**
   * @return list of items
   */
  public static ArrayList testCollection() {
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);
    ArrayList<Product> products = new ArrayList<>();
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here

  /**
   * @param list to be sorted
   * @param <T> Generic
   * @param <E> Generic
   */
  public static <T extends Iterable<E>, E> void print(T list) {
    for (E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }
}