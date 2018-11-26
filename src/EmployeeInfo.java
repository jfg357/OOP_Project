/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.Scanner;

/**
 * The program is required to create an audit trail on its tests of the production line so that it
 * records which employee ran the test.  To accomplish this you will need to create a class named
 * EmployeeInfo that will allow the user to input their full name and then create a user id of their
 * first initial and surname.
 *
 * <p>This is a <a href="package-summary.html">Employee Info Class</a>
 *
 * @author Juan Gaviria
 * @version 0.10
 * @serial
 * @since 0.3
 */

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  /**
   * Set the name using the default constructor
   */
  public EmployeeInfo() {
    setName();
  }

  /**
   *
   * @return name
   */
  public StringBuilder getName() {
    return name;
  }

  /**
   *
   * @return code
   */
  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //valid, includes space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }
  }

  /**
   *
   * @return nameString
   */
  private String inputName() {
    String nameString;
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter your first and last name: ");
    nameString = scan.nextLine();
    scan.close();
    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

}