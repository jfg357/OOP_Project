/*
 * Author: Juan Gaviria
 * Java Enumerator to improve rapid development
 * The Interface is a group of related methods with empty bodies.
 * Interfaces form a contract between the class and the outside world, and this contract is enforced
 * at build time by the compiler. All methods defined by that interface must appear in its source
 * code before the class will successfully compile.
 */

public enum ItemType {
  // Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");
  AU("Audio"), AM("AudioMobile"), VI("Visual"), VM("VisualMobile");

  private String type;

  ItemType(String name) {
    this.type = name;
  }

  public String getName() {
    return type;
  }
}