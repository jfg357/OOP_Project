/**
 * <h1>Java Enum Type</h1>
 * The <b>Enum</b> type is a special data type that enables for a variable to be a set of predefined
 * constants. The variable must be equal to one of the values that have been predefined for it.
 * <p></p>
 * Because they are constants, the names of an enum type's fields are in uppercase letters.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @code System.out.println(ItemType.AudioMobile.getName ());
 * @serial
 * @since 2018-09-20
 */
public enum ItemType {
  Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");

  private String type;

  ItemType(String name) {
    this.type = name;
  }

  public String getName() {
    return type;
  }
}