/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.Scanner;
import java.util.regex.*;

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

  private String deptId;
  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  private Scanner in;

  /**
   * Set the name using the default constructor
   */
  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  /**
   * @return name
   */
  public StringBuilder getName() {
    return name;
  }

  /**
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
    // Test for validity - spaces
    if (checkName(name)) {
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "None";
    }
  }

  /**
   * @return nameString
   */
  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameString = in.nextLine();
    return nameString;
  }

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = reverseString(id);
//      this.deptId = id;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  public String reverseString(String id) {
    byte [] strAsByteArray = id.getBytes();
    byte [] result = new byte [strAsByteArray.length];

    // Store result in reverse order into the
    // result byte[]
    for (int i = 0; i<strAsByteArray.length; i++) {
      result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    }
    return new String(result);
  }

  public String toString() {
    return "Employee Code : " + this.code +
        "\nDepartment Number : " + this.deptId;
  }

}