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
 * @version 0.1
 * @serial
 * @since 0.1
 */

public class Main {

  public static void main(String[] args) {
//    AudioPlayerDriver.testAudioPlayer();

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products = new ArrayList<>();

    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();

    // Write one line of code to sort the ArrayList

    Collections.sort(products);

    // Call the print method on the ArrayList
    print(products);
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList<Product> testCollection() {

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

  public static <T extends Iterable<E>, E> void print(T list) {
    for (E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }

}

/* My old Main public
public class Main {

  */
/**
 * @param args this is the main
 * @throws InterruptedException when it does
 *//*

  public static void main(String[] args) throws InterruptedException {
//    AudioPlayerDriver.testAudioPlayer();
    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();
  }

  public static void testProduct() {
    // Simple banner to display current step
    System.out.println("########### Step 2 - Item Type Test ###########\n");

    // Iteration and printing of the enum ItemType using Lambda expression
    EnumSet.allOf(ItemType.class)
        .forEach(type -> System.out.println("Code: " + type.getCode() + " -> " + type));

    // Simple banner to display current step
    System.out.println("\n########### Step 3 ###########\n");
    ArrayList<String> devicesArrayList = new ArrayList<>();
    devicesArrayList.add("DVD");
    devicesArrayList.add("CD");
    devicesArrayList.add("Blu-ray");
    devicesArrayList.add("4K");
    devicesArrayList.add("3D");

    // Display the Device information using the toString method - default constructor
    System.out.println(new Device() + "\n");

    // simple foreach to iterate through the devicesArrayList
    for (String aDevicesArrayList : devicesArrayList) {
      // Add random timeout to get unique time
      //TimeUnit.SECONDS.sleep(new Random().nextInt(3) + 1);
      // Display the Device information using the toString method
      System.out.println(new Device(aDevicesArrayList).toString() + "\n");
    }

    // Making sure the name parameter was not modified
    System.out.println(new Device());
  }


}*/
