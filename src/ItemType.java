/**
 * <ul>
 *  <li>Author: Juan Gaviria</li>
 *  <li>Java Enumerator to improve rapid development
 *    The Interface is a group of related methods with empty bodies.
 *    Interfaces form a contract between the class and the outside world, and this contract is enforced
 *    at build time by the compiler. All methods defined by that interface must appear in its source
 *    code before the class will successfully compile.
 *  </li>
 * </ul>
 */

public enum ItemType {
   Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");

  private String type;

  /**
   *
   * @param name
   */
  ItemType(String name) {
    this.type = name;
  }

  /**
   *
   * @return
   */
  public String getName() {
    return type;
  }
}