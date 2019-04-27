public class Main {
  public static void main(String[] args) {
    Human h1 = new Human("hoge1", 180, 50, 20);
    Human h2 = new Human("hoge2", 150, 50, 30);
    MyClass my = new MyClass(new HeightComparator());
    System.out.println(my.compare(h1, h2));
  }
}
