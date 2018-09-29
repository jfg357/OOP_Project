/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

import java.util.*;
import java.util.concurrent.*;

/**
 * This is the main driving class for the project
 *
 * <p>This is a <a href="package-summary.html">driving method</a>
 *
 * @author Juan Gaviria
 * @version 0.1
 * @code Product prod1 = new Device("Product Name");
 * @serial
 * @since 0.1
 */
public class Main {

  public static void main(String[] args) throws InterruptedException {

    // Simple banner to display current step
    System.out.println("########### Step 2 - Item Type Test ###########\n");

    // Iteration and printing of the enum ItemType using Lambda expression
    EnumSet.allOf(ItemType.class)
        .forEach(type -> System.out.println("Code: " + type.getName() + " is: " + type));

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

    // Simple for loop to iterate through the devicesArrayList
    for (int i = 0; i < devicesArrayList.size(); i++) {
      // Add random timeout to get unique time
      TimeUnit.SECONDS.sleep(new Random().nextInt(3) + 1);
      // Display the Device information using the toString method
      System.out.println(new Device(devicesArrayList.get(i)).toString() + "\n");
    }

    // Making sure the name parameter was not modified
    System.out.println(new Device());

  }
}