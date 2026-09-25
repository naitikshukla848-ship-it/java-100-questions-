public class Q070EncapsulationValidation {

  // 70. EncapsulationValidation: Demonstrates the requested OOP concept.
  static class Parent {

    void action() {
      System.out.println("Parent action");
    }
  }

  static class Child extends Parent {

    @Override
    void action() {
      System.out.println("Child override");
    }
  }

  interface Feature {
    default void demonstrate() {
      System.out.println("Interface default method");
    }
  }

  abstract static class Base {

    abstract void work();

    final void common() {
      System.out.println("Final/concrete method");
    }
  }

  static class Example extends Base implements Feature {

    void work() {
      System.out.println("Abstract method implemented");
    }
  }

  public static void main(String[] args) {
    Parent p = new Child();
    p.action();
    Example e = new Example();
    e.common();
    e.work();
    e.demonstrate();
  }
}
