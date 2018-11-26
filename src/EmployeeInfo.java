import java.util.Scanner;

public class EmployeeInfo {

  //The class will have 2 fields
  private StringBuilder name;
  private String code;

  //Default Constructor
  public EmployeeInfo() {
    setName();
  }

  //The class will have the following methods defined:
  public StringBuilder getName() {
    return name;
  }

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