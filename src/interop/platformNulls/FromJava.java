package p3_platformNulls;

class FromJava {
  public static void main(String[] args) {
    new Kotlin().hello(null);
  }
}

// What will it print?
// a) Hello
// b) Hello null
// c) NullPointerException
// d) IllegalArgumentException