import java.util.concurrent.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Product prod1 = new Product("Product Name");
    System.out.println(prod1.toString());
    TimeUnit.SECONDS.sleep(5);
    Product prod2 = new Product("DVD");
    System.out.println(prod1.toString());
    TimeUnit.SECONDS.sleep(2);
    Product prod3 = new Product("CD");
    System.out.println(prod1.toString());
  }
}
