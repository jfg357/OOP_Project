import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {
  public static void main(String[] args) {
    Product prod1 = new Product("Product Name");
    System.out.println(prod1.toString());
    Product prod2 = new Product("DVD");
    System.out.println(prod1.toString());
    Product prod3 = new Product("CD");
    System.out.println(prod1.toString());
  }
}
