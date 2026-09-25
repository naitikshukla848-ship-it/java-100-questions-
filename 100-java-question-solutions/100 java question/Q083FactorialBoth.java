public class Q083FactorialBoth {

  static int add(int a, int b) {
    return a + b;
  }

  static boolean isPalindrome(int n) {
    int o = n,
      r = 0;
    while (n > 0) {
      r = r * 10 + (n % 10);
      n /= 10;
    }
    return o == r;
  }

  static long fact(int n) {
    return n < 2 ? 1 : n * fact(n - 1);
  }

  static int gcd(int a, int b) {
    while (b != 0) {
      int t = b;
      b = a % b;
      a = t;
    }
    return a;
  }

  static int sumDigits(int n) {
    int s = 0;
    while (n > 0) {
      s += n % 10;
      n /= 10;
    }
    return s;
  }

  static boolean isPerfect(int n) {
    int s = 0;
    for (int i = 1; i < n; i++) if (n % i == 0) s += i;
    return s == n;
  }

  static void show(double n) {
    System.out.println(n);
  }

  static void show(int n, String s) {
    System.out.println(n + s);
  }

  static void show(String s, int n) {
    System.out.println(s + n);
  }

  static void show(int... a) {
    System.out.println(a.length);
  }

  static long iter(int n) {
    long f = 1;
    while (n > 1) f *= n--;
    return f;
  }

  static boolean anagram(String a, String b) {
    char[] x = a.toCharArray(),
      y = b.toCharArray();
    java.util.Arrays.sort(x);
    java.util.Arrays.sort(y);
    return java.util.Arrays.equals(x, y);
  }

  interface Marker {}

  static class Marked implements Marker {}

  static class Singleton {

    static final Singleton INSTANCE = new Singleton();

    private Singleton() {}
  }

  static class Bean {

    private String name;
    private int age;

    public Bean() {}

    public String getName() {
      return name;
    }

    public void setName(String v) {
      name = v;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int v) {
      age = v;
    }
  }

  public static void main(String[] args) {
    System.out.println(iter(5) + " " + fact(5));
  }
}
