/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.io.*;
import java.nio.file.*;

/**
 * The program is required to read the process file of the production line so that it records which
 * employee ran the test.  To accomplish this you will need to create a class named EmployeeInfo
 * that will allow the user to input their full name and then create a user id of their first
 * initial and surname.
 *
 * <p>This is a <a href="package-summary.html">View File Class</a>
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.5
 */

public class ViewFileInfo {

  public ViewFileInfo() {
    ReadFile();
  }

  private static void ReadFile() {
    //The class will have three fields:
    Path p = Paths.get("C:/LineTests");
    Path p2 = Paths.get("TestResults.txt");
    Path p3 = p.resolve(p2);

    String filepath = p3.toString();

    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
      StringBuilder fileContents = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
        fileContents.append(line);
        fileContents.append(System.lineSeparator());
        line = br.readLine();
      }//end while
      String fileComplete = fileContents.toString();
      System.out.println(fileComplete);
    }//end try
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }//end ReadFile
}
