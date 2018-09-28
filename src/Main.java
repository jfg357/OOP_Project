import java.util.concurrent.*;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Product prod1 = new Product("Product Name");
    System.out.println(prod1.toString());
    TimeUnit.SECONDS.sleep(3);
    Product prod2 = new Product("DVD");
    System.out.println(prod1.toString());
    TimeUnit.SECONDS.sleep(2);
    Product prod3 = new Product("CD");
    System.out.println(prod1.toString());

//    System.out.println(ItemType.AudioMobile.getName());
  }
}
